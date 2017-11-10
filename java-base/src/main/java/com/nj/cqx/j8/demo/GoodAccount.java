package com.nj.cqx.j8.demo;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * GoodAccount
 * Author: chenqingxia
 * Date: 2017/10/30
 */
public class GoodAccount {
    String goodId;
    String username;
    String password;
    public GoodAccount(String goodId, String username, String password) {
        this.goodId = goodId;
        this.username = username;
        this.password = password;
    }
    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
