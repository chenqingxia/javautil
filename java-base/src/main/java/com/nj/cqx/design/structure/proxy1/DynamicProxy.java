package com.nj.cqx.design.structure.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * DynamicProxy
 * Author: chenqingxia
 * Date: 2017/7/14
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;
    public DynamicProxy(Object target) {
        this.target = target;
    }


    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }
    private void before() {
        System.out.println("Before");
    }


    private void after() {
        System.out.println("After");
    }
}
