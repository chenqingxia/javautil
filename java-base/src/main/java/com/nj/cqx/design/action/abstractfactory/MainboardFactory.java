package com.nj.cqx.design.action.abstractfactory;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * MainboardFactory
 * Author: chenqingxia
 * Date: 2017/10/12
 */
public class MainboardFactory {
    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
