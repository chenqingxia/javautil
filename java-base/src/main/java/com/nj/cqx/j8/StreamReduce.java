package com.nj.cqx.j8;

import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * StreamReduce
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class StreamReduce {
    public static void main(String[] args) {
        //reduce
        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println("concat="+concat);
        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MIN_VALUE, Double::min);
        System.out.println("minValue="+minValue);
        // 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println("sumValue="+sumValue);
        // 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println("sumValue="+sumValue);
        // 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
        System.out.println("concat="+concat);

        String s1="a";
        String s2="A";
        System.out.println(s1.compareTo("A"));
        System.out.println(s2.compareTo("A"));
    }
}
