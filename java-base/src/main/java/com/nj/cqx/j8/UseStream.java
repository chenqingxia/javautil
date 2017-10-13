package com.nj.cqx.j8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * UseStream
 * Author: chenqingxia
 * Date: 2017/6/12
 */
public class UseStream {
    public static void main(String[] args) {
        Person person = new Person("chen", 16);
        Person person2 = new Person("chen2", 17);
        Person person3 = new Person("chen3", 29);
        Person person4 = new Person("chen4", 26);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        //获取值
        List<String> nameList = personList.stream().map(x -> x.getName()).collect(Collectors.toList());
        List<Integer> ageList = personList.stream().map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println(personList.stream().count());
        System.out.println(personList.stream().distinct().count());
        //排序
        List<Person> orderAgeAscList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        List<Person> orderAgeDescList = personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        orderAgeDescList.stream().forEach(param -> System.out.println(param.getName() + ":" + param.getAge()));
        //过滤
        Stream<Person> filterStream = personList.stream();
        Stream stream20 = filterStream.filter((Person o) -> o.getAge() >= 20);
        List<Person> pList = (List<Person>) stream20.collect(Collectors.toList());
        //合并的写法
        List<Person> p20List = personList.stream().filter((Person o) -> o.getAge() >= 20).collect(Collectors.toList());
        System.out.println("年龄大于20的");
        p20List.stream().forEach((Person p) -> System.out.println(p.getName() + ":" + p.getAge()));
    }
}
