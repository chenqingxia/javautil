package com.nj.cqx.design.structure.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * CustomInvocationHandler
 * Author: chenqingxia
 * Date: 2017/7/26
 */
public class CustomInvocationHandler implements InvocationHandler {
    private Object target;
    public CustomInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invocation");
        Object retVal = method.invoke(target, args);
        System.out.println("After invocation");
        return retVal;
    }

}
