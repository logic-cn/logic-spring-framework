package com.logic;


import com.logic.service.UserService;
import com.spring.AnnotationConfigApplicationContext;
import com.spring.AppConfig;

/**
 * @description: 启动类
 * @author: logic 2021-07-05 00:48
 **/
public class LogicApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
