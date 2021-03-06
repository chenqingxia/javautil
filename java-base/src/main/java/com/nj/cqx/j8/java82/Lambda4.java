package com.nj.cqx.j8.java82;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Lambda4
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public class Lambda4 {
    //七、访问对象字段与静态变量
    //和本地变量不同的是，lambda内部对于实例的字段以及静态变量是即可读又可写。该行为和匿名对象是一致的：
    static int outerStaticNum;
    int outerNum;
    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
