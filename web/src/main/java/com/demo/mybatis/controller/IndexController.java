package com.demo.mybatis.controller;

import com.demo.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        Integer i = iUserService.countUser();

        return i.toString();
    }
}
