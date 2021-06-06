package com.example.springbootdemoone.service;

import com.example.springbootdemoone.model.user;

public interface UserService {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    user queryUserByUsername(String username);

    int insertUserSelective(user newuser);
}
