package com.nj.cqx.j8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * demo
 * Author: chenqingxia
 * Date: 2017/11/9
 */
public class demo {
    public static void main(String[] args) {
        //Optional<T>有方法 isPresent() 和 get() 是用来检查其包含的对象是否为空或不是，然后返回它
        Stream<String> names = Stream.of("Lamurudu", "Lkanbi", "Oduduwa");
        Optional<String> longest = names
                .filter(name -> name.startsWith("L"))
                .findFirst();
        if(longest.isPresent()){
            System.out.println(longest.get());
        }
        longest.ifPresent(nn -> {
            String s = nn.toUpperCase();
            System.out.println("The longest name is "+ s);
        });
        List<String> list=new ArrayList<>();
        list.add("chen");
        list.add("qing");
        list.add("xia");
        Optional<String> startc = list.stream()
                .filter(name->name.startsWith("d"))
                .findFirst();
        if(startc.isPresent()){
            System.out.println(startc.get().toUpperCase());
        }
        //使用ifPresent()
        startc.ifPresent(name->{
            String s=name.toLowerCase();
            System.out.println(s);
        });
        //orElse
        //如果在T可能空时你需要一个值的话，那么可以使用 orElse()，它能在T值存在的情况下返回这个值，否则返回输入值。
        String orElseName = startc.orElse("dream");
        System.out.println(orElseName);
        String dd="ccc,rrr";
        Optional<String> opt = Optional.of(dd);
        System.out.println(startc.orElse(null));
        if(opt.isPresent()){
            System.out.println(Arrays.asList(opt.get().split(",")));
        }
    }
}
