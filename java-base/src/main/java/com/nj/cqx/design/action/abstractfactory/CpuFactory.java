package com.nj.cqx.design.action.abstractfactory;

/**
 * Cpu工厂类
 * Copyright (C), 2015-2016 中盈优创
 * CpuFactory
 * Author: chenqingxia
 * Date: 2017/10/12
 */
public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
