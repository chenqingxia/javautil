package com.nj.cqx.design.structure.proxy1;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * test
 * Author: chenqingxia
 * Date: 2017/7/14
 */
public class test {
    public static void main(String[] args) {
        //静态代理
        ProxyHello helloProxy = new ProxyHello();
        helloProxy.say("Jack");
        //懂态代理
//        Hello hello = new Hello();
//        DynamicProxy dynamicProxy = new DynamicProxy(hello);
//        Hello helloProxy1 = (Hello) Proxy.newProxyInstance(
//                hello.getClass().getClassLoader(),
//                hello.getClass().getInterfaces(),
//                dynamicProxy
//        );
        DynamicProxy dynamicProxy = new DynamicProxy(new Hello());
        IHello helloProxy1 = dynamicProxy.getProxy();
        helloProxy1.say("Jack");
    }
}
