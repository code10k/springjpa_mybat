package com.code10000.springdemo.mybatis.data.repository;

import com.code10000.springdemo.mybatis.domain.User;
import com.code10000.springdemo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public int insertUser(String username, String password) {
        return userMapper.insertUser(username, password);
    }

    public int insertUserWithBackId(User user) {
        return userMapper.insertUserWithBackId(user);
    }

}