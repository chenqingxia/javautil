package com.nj.cqx.j8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Syntax
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class Syntax {
    public static void main(String[] args) {
        //() -> {for (int i = 0; i < 1000; i++) doSomething();};
        String []datas = new String[] {"peng","zhao","li"};
        Arrays.sort(datas,(String v1, String v2) -> Integer.compare(v1.length(), v2.length()));
        Arrays.sort(datas,(v1,v2)->Integer.compare(v1.length(),v2.length()));
        Stream.of(datas).forEach(param -> {System.out.println(param);});

        Arrays.sort(datas,String::compareToIgnoreCase);
        Stream.of(datas).forEach(System.out::println);
    }
}
