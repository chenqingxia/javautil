package com.nj.cqx.j8.java85;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * MapTest
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val));
    }
}
