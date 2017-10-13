package com.nj.cqx.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * j8
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class j8 {
    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        TimeUnit.SECONDS.sleep(1000);

        new Thread(() -> System.out.println("Hello World!")).start();
        TimeUnit.SECONDS.sleep(1000);
        new Thread(()->System.out.println("hello world")).start();

        String []datas = new String[] {"peng","zhao","li"};
        Comparator<String> comp = (v1, v2) -> Integer.compare(v1.length(), v2.length());
        Arrays.sort(datas,comp);
        Stream.of(datas).forEach(param -> {System.out.println(param);});
        //有时，我们需要执行的代码在某些类中已经存在，这时我们没必要再去写Lambda表达式，可以直接使用该方法，这种情况我们称之为方法引用，如下所示，未采用方法引用前的代码

        Arrays.sort(datas,String::compareToIgnoreCase);
        Stream.of(datas).forEach(System.out::println);
        //System.out::println == x -> System.out.println(x)
        //String::compareToIgnoreCase == (x,y) ->     x.compareToIgnoreCase(y)
        //构造方法的引用
        String str = "test";
        Stream.of(str).map(String::new).peek(System.out::println).findFirst();
        String []copyDatas = Stream.of(datas).toArray(String[]::new);
        Stream.of(copyDatas).forEach(x -> System.out.println(x));
//        总结一下，构造方法引用有两种形式
//
//        Class::new
//        Class[]::new

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }
}
