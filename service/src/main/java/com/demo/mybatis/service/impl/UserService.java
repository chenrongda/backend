package com.demo.mybatis.service.impl;

import com.demo.mybatis.dao.UserDao;
import com.demo.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer countUser() {
        return userDao.countUser();
    }
}
