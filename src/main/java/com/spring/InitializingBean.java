package com.spring;

/**
 * @description: InitializingBean
 * @author: logic
 * @create: 2021-07-17 23:12
 **/
public interface InitializingBean {

    void afterPropertiesSet() throws  Exception;
}
