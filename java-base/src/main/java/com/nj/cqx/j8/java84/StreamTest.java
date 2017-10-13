package com.nj.cqx.j8.java84;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * StreamTest
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public class StreamTest {
    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

//        然后我们计算一下排序这个Stream要耗时多久，
//        串行排序：

        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    //    并行排序：parallelStream


        long t3 = System.nanoTime();
        long count3 = values.parallelStream().sorted().count();
        System.out.println(count3);

        long t4 = System.nanoTime();

        long millis4 = TimeUnit.NANOSECONDS.toMillis(t4 - t3);
        System.out.println(String.format("parallel sort took: %d ms", millis4));
    }
}
