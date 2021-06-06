package com.example.springbootdemoone.mapper;

import com.example.springbootdemoone.model.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(String username);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}