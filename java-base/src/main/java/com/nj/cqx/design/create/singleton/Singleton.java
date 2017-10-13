package com.nj.cqx.design.create.singleton;

/**
 * 单例
 * Copyright (C), 2015-2016 中盈优创
 * Singleton
 * Author: chenqingxia
 * Date: 2017/3/9
 */
public class Singleton {
    /* 私有构造方法，防止被实例化 */
    private void Singleton(){

    }
    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory{
        private static Singleton instance=new Singleton();
    }
    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
