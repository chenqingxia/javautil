package com.nj.cqx.design.create.abstractfactory;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * AmdCpu
 * Author: chenqingxia
 * Date: 2017/10/11
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
