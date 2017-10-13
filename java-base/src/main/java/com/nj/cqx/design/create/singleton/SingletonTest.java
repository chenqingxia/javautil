package com.nj.cqx.design.create.singleton;

import java.util.Vector;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * SingletonTest
 * Author: chenqingxia
 * Date: 2017/3/9
 */
public class SingletonTest {
   // 因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
    private static SingletonTest instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
    public void updateProperties() {
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }
}
