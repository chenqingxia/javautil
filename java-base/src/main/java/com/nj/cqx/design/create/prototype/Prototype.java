package com.nj.cqx.design.create.prototype;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Prototype 抽象原型角色
 * Author: chenqingxia
 * Date: 2017/10/16
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object clone();
}
