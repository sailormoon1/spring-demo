package com.example.springdemo.demo.dao;


import com.example.springdemo.demo.entity.BasDept;
import com.example.springdemo.demo.entity.BasDeptKey;

public interface BasDeptMapper {
    int deleteByPrimaryKey(BasDeptKey key);

    int insert(BasDept record);

    int insertSelective(BasDept record);

    BasDept selectByPrimaryKey(BasDeptKey key);

    int updateByPrimaryKeySelective(BasDept record);

    int updateByPrimaryKey(BasDept record);
}