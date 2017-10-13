package com.nj.cqx.j8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Sort
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class Sort {
    public static void main(String[] args) {
        //按字典排
        String []datas = new String[] {"chen","qing","xia"};
        Arrays.sort(datas);
        Stream.of(datas).forEach(param ->     System.out.println(param));
        //按长度排
        Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));
        Stream.of(datas).forEach(param -> System.out.println(param));

        List<Person> personList = new ArrayList<>();
        for(int i=0;i<1000;i++){

        }
    }
}
