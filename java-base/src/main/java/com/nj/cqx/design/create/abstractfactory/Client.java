package com.nj.cqx.design.create.abstractfactory;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Client
 * Author: chenqingxia
 * Date: 2017/10/12
 */
public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);
    }
}
