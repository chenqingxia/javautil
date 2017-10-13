package com.nj.cqx.design.action.template;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Student
 * Author: chenqingxia
 * Date: 2017/9/5
 */
public class Student extends AbstractPerson {
    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }
    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}
