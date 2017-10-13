package com.nj.cqx.design.create.abstractfactory;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * IntelCpu
 * Author: chenqingxia
 * Date: 2017/10/11
 */
public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
