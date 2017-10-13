package com.nj.cqx.j8.java81;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Formula
 * Author: chenqingxia
 * Date: 2017/6/13
 */
//java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法
@FunctionalInterface
public interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
