package com.nj.cqx.design.create.prototype;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * ConcretePrototype1
 * Author: chenqingxia
 * Date: 2017/10/16
 */
public class ConcretePrototype1 implements Prototype {
    public Prototype clone(){
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
