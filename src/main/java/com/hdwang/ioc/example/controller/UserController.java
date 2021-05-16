package com.hdwang.ioc.example.controller;

import com.hdwang.ioc.core.annotation.AutoInject;
import com.hdwang.ioc.core.annotation.MyBean;
import com.hdwang.ioc.example.model.User;
import com.hdwang.ioc.example.service.UserService;

@MyBean("userController")
public class UserController {

    @AutoInject
    UserService userService;

    public User getUserById(Long id) {
        return userService.getUserById(id);
    }
}
