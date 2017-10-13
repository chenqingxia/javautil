package com.nj.cqx.j8.java83;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * PersonFactory
 * Author: chenqingxia
 * Date: 2017/6/13
 */
public interface PersonFactory<P extends Person> {
    P Create(String firstName, String lastName);
}
