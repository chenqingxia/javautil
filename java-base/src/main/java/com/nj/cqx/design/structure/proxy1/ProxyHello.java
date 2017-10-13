package com.nj.cqx.design.structure.proxy1;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * ProxyHello
 * Author: chenqingxia
 * Date: 2017/7/14
 */
public class ProxyHello implements IHello {


    private Hello hello;


    public ProxyHello() {
        hello = new Hello();
    }


    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }


    private void before() {
        System.out.println("Before");
    }


    private void after() {
        System.out.println("After");
    }


}