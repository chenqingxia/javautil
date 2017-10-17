package com.nj.cqx.design.create.builder;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Client
 * Author: chenqingxia
 * Date: 2017/10/16
 */
public class Client {
    public static void main(String[]args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
