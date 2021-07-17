package com.logic.service;

import com.spring.BeanPostProcessor;
import com.spring.annotation.Component;

/**
 * @description: BeanPostProcessor
 * @author: logic 2021-07-17 23:24
 **/
@Component
public class LogicBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("初始化前...");
        if ("userService".equals(beanName)) {
            ((UserService)bean).setName("测试name");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("初始化后...");
        return bean;
    }

}
