package com.pzh.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pzh.pojo.User;
import com.pzh.service.UserServiceImpl;
import config.MySwagger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

import java.util.List;

/**
 * Time: 2020/7/15
 *
 * @author PZH
 */
@Api
@RestController
@ComponentScan(basePackageClasses= {MySwagger.class})
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/user/add")
    @ApiOperation("添加用户")
    public void addUser(@RequestParam("用户名") String username, @RequestParam("密码") String password,
                         @RequestParam("身份") String identity){
        userService.addUser(username,password,identity);
    }
    @GetMapping("/user/get/{id}")
    @ApiOperation("查询单个用户")
    public User queryUser(@PathVariable("id") int id){
        return userService.queryUser(id);
    }

    @GetMapping("/user/get")
    @ApiOperation("查询用户")
    public List<User> queryUserList(){
        return userService.queryUserList();
    }
}
