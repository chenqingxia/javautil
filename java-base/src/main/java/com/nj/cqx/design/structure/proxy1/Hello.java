package com.nj.cqx.design.structure.proxy1;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Hello
 * Author: chenqingxia
 * Date: 2017/7/14
 */
public class Hello implements IHello {
    @Override
    public void say(String name) {
        System.out.println(name);
    }
}
