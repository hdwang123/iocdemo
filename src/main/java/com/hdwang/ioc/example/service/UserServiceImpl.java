package com.hdwang.ioc.example.service;

import com.hdwang.ioc.core.annotation.MyBean;
import com.hdwang.ioc.example.model.User;

@MyBean("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        if (id == 1) {
            user.setId(id);
            user.setName("张三");
        } else if (id == 2) {
            user.setId(id);
            user.setName("李四");
        }
        return user;
    }
}
