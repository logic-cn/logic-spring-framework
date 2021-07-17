package com.spring;

/**
 * @description: Bean定义
 * @author: logic 2021-07-05 01:21
 **/
public class BeanDefinition {

    private Class clazz;
    private String scope;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
