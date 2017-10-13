package com.nj.cqx.design.action.template;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Client
 * Author: chenqingxia
 * Date: 2017/9/5
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchool();

        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchool();
    }
}
