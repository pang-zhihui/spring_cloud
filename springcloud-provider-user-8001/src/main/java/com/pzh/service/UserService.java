package com.pzh.service;

import com.pzh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Time: 2020/7/15
 *
 * @author PZH
 */
public interface UserService {
    public void addUser(String username,String password,String identity);

    public User queryUser(Map map);

    public List<User> queryUserList();
}
