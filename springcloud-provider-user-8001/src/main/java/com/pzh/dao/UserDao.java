package com.pzh.dao;

import com.pzh.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Time: 2020/7/15
 *
 * @author PZH
 */
@Mapper
@Repository
public interface UserDao {
    public void addUser(User user);

    public User queryUser(Map map);

    public List<User> queryUserList();
}
