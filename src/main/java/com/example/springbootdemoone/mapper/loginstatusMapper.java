package com.example.springbootdemoone.mapper;

import com.example.springbootdemoone.model.loginstatus;

public interface loginstatusMapper {
    int deleteByPrimaryKey(String username);

    int insert(loginstatus record);

    int insertSelective(loginstatus record);

    loginstatus selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(loginstatus record);

    int updateByPrimaryKey(loginstatus record);
}