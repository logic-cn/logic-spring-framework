package com.spring;

/**
 * @description: BeanPostProcessor
 * @author: logic
 * @create: 2021-07-17 23:19
 **/
public interface BeanPostProcessor {

    /**
     * 初始化前回调
     *
     * @param bean     Bean实例
     * @param beanName Bean名称
     * @return Bean实例
     */
    Object postProcessBeforeInitialization(Object bean, String beanName);

    /**
     * 初始化后回调
     *
     * @param bean     Bean实例
     * @param beanName Bean名称
     * @return Bean实例
     */
    Object postProcessAfterInitialization(Object bean, String beanName);

}
