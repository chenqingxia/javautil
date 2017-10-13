package com.nj.cqx.j8;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Person
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class Person {
    private String name;
    private Integer age;
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
