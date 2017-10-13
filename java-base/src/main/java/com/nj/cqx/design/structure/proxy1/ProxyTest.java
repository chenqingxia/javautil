package com.nj.cqx.design.structure.proxy1;

import java.lang.reflect.Proxy;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * ProxyTest
 * Author: chenqingxia
 * Date: 2017/7/26
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        CustomInvocationHandler handler = new CustomInvocationHandler(new Hello());
        IHello proxy = (IHello) Proxy.newProxyInstance(
                ProxyTest.class.getClassLoader(),
                new Class[]{IHello.class},
                handler);
        proxy.say("Mikan");
    }
}
