package com.nj.cqx.design.create.abstractfactory;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * IntelMainboard
 * Author: chenqingxia
 * Date: 2017/10/12
 */
public class IntelMainboard implements Mainboard {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public IntelMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
