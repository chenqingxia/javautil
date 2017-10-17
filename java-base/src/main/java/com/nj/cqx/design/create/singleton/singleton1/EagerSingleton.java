package com.nj.cqx.design.create.singleton.singleton1;

/**
 * 饿汉式单例类
 * Copyright (C), 2015-2016 中盈优创
 * EagerSingleton
 * Author: chenqingxia
 * Date: 2017/10/17
 */
public class EagerSingleton {
    //饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
    private static EagerSingleton instance = new EagerSingleton();
    /**
     * 私有默认构造子
     */
    private EagerSingleton(){}
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
