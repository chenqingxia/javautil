package com.nj.cqx.design.create.singleton.singleton1;

/**
 * 懒汉式单例类
 * Copyright (C), 2015-2016 中盈优创
 * LazySingleton
 * Author: chenqingxia
 * Date: 2017/10/17
 */
public class LazySingleton {
//    懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
//
//    　　由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。那么有没有更好的方式实现呢？
    private static LazySingleton instance = null;
    /**
     * 私有默认构造子
     */
    private LazySingleton(){}
    /**
     * 静态工厂方法
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
