package com.demo.mybatis.dao;

import com.demo.mybatis.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends UserMapper {

    public Integer countUser();

}
