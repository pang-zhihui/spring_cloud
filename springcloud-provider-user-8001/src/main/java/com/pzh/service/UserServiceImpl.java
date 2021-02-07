package com.pzh.service;

import com.pzh.dao.UserDao;
import com.pzh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import util.SnowFlake;

import java.util.*;

/**
 * Time: 2020/7/15
 *
 * @author PZH
 */
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(String username,String password,String identity) {
        User user = new User();
        int id = (int) new SnowFlake(2,3).nextId();
        user.setUsername(username).setPassword(password).setId(id).setIdentity(identity).setRegistTime(new Date()).setCem("");
        userDao.addUser(user);
    }

    @Override
    public User queryUser(Map map) {
        return userDao.queryUser(map);
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }
}
