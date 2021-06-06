package com.example.springbootdemoone.service.impl;

import com.example.springbootdemoone.mapper.userMapper;
import com.example.springbootdemoone.model.user;
import com.example.springbootdemoone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private userMapper userMapper;

    @Override
    public user queryUserByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    @Override
    public  int insertUserSelective(user newuser){
        int code=userMapper.insertSelective(newuser);
        return code;
    }
}
