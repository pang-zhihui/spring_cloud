package com.pzh.springcloud;

import com.pzh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.security.auth.login.Configuration;
import javax.xml.transform.Templates;
import java.util.List;

/**
 * Time: 2020/7/16
 *
 * @author PZH
 */
@RestController
public class UserSonsumerController {

    @Autowired
    private RestTemplate restTemplate;   //提供多种便捷访问http服务的方法，简单的Restful服务模板

    private static final String REST_URL_PREFIX = "http://springcloud-provider-user8001";

    @RequestMapping("/consumer/user/get/{id}")
    public User getUserById(@PathVariable("id") int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/get/"+id,User.class);
    }

    @GetMapping("/consumer/user/get")
    public List<User> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/get",List.class);
    }


}
