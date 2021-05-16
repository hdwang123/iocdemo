package com.hdwang.ioc.example;

import com.hdwang.ioc.core.BeanFactory;
import com.hdwang.ioc.example.controller.UserController;
import com.hdwang.ioc.example.model.User;

/**
 * 程序启动类
 */
public class Main {

    /**
     * 主函数入口
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        //定义要扫描的包名
        String basePackage = "com.hdwang.ioc.example";

        //初始化Bean工厂
        BeanFactory beanFactory = new BeanFactory(basePackage);

        //获取指定的Bean
        UserController userController = beanFactory.getBean(UserController.class);

        //调用Bean中的方法
        User user = userController.getUserById(1L);
        System.out.println(user);
    }
}
