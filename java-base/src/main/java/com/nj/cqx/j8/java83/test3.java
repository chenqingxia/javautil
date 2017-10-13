package com.nj.cqx.j8.java83;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * test3
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public class test3 {
    public static void main(String[] args) {
        //person::new 来获取Person类构造函数的引用
        PersonFactory<Person> personFactory=Person::new;
        personFactory.Create("qingxia","chen");

    }
}
