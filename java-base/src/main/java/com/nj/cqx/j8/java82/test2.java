package com.nj.cqx.j8.java82;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * test2
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public class test2 {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
        // 通过静态方法引用来表示：
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter.convert("123");
        System.out.println(converted2);   // 123
        //引用一个对象的方法：

        //        五、Lambda 作用域
//        在lambda表达式中访问外层作用域和老版本的匿名对象中的方式很相似。你可以直接访问标记了final的外层局部变量，或者实例的字段以及静态变量。
//
//        六、访问局部变量
//
//        我们可以直接在lambda表达式中访问外层的局部变量：
        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        stringConverter.convert(2);     // 3

    }
}
