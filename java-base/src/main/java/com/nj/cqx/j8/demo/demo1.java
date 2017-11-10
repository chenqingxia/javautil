package com.nj.cqx.j8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * demo1
 * Author: chenqingxia
 * Date: 2017/10/30
 */
public class demo1 {
    public static void main(String[] args) {

        List<GoodAccount> goodAccountList =new ArrayList<>();
        GoodAccount goodAccount1 = new GoodAccount("1","cqx","111111");
        GoodAccount goodAccount2 = new GoodAccount("2","cqx","111111");
        GoodAccount goodAccount3 = new GoodAccount("3","cqx","111111");
        GoodAccount goodAccount4 = new GoodAccount("4","cqx","111111");
        GoodAccount goodAccount5 = new GoodAccount("5","cqx","111111");
        goodAccountList.add(goodAccount1);
        goodAccountList.add(goodAccount2);
        goodAccountList.add(goodAccount3);
        goodAccountList.add(goodAccount4);
        goodAccountList.add(goodAccount5);
        List<GoodDisplay> goodDisplayList =new ArrayList<>();
        GoodDisplay goodDisplay1 = new GoodDisplay("1","producter1","1");
        GoodDisplay goodDisplay2 = new GoodDisplay("2","producter2","1");
        GoodDisplay goodDisplay3 = new GoodDisplay("7","producter3","1");
        goodDisplayList.add(goodDisplay1);
        goodDisplayList.add(goodDisplay2);
        goodDisplayList.add(goodDisplay3);
        goodAccountList.forEach(goodAccount -> {
            Optional<GoodDisplay> goodDisplayOptional = goodDisplayList.stream().filter(goodDisplay -> goodAccount.getGoodId() == goodDisplay.getGoodId()).findFirst();
            if(goodDisplayOptional.isPresent()){
               System.out.println(goodDisplayOptional.get().goodName);
            }
        });
        goodAccountList.forEach(goodAccount -> {
            System.out.println(goodAccount.getUsername());
        });

    }
}
