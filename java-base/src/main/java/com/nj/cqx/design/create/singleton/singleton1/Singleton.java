package com.nj.cqx.design.create.singleton.singleton1;

/**
 * 双重检查加锁
 * Copyright (C), 2015-2016 中盈优创
 * Singleton
 * Author: chenqingxia
 * Date: 2017/10/17
 */
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
