package com.nj.cqx.design.action.template;

/**
 * 模板模式
 * Copyright (C), 2015-2016 中盈优创
 * AbstractPerson
 * Author: chenqingxia
 * Date: 2017/9/5
 */
//举个例子，以准备去学校所要做的工作（prepareGotoSchool）为例，假设需要分三步：穿衣服（dressUp），吃早饭（eatBreakfast），带上东西（takeThings）。
// 学生和老师要做得具体事情肯定有所区别。
//        抽象类AbstractClass
public abstract class AbstractPerson {
    //抽象类定义整个流程骨架
    public void prepareGotoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
    }
    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract void dressUp();
    protected abstract void eatBreakfast();
    protected abstract void takeThings();
}
