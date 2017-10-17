package com.nj.cqx.design.create.prototype.prototype1;

import java.io.Serializable;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * GoldRingedStaff
 * Author: chenqingxia
 * Date: 2017/10/17
 */
public class GoldRingedStaff implements Serializable {
    private float height = 100.0f;
    private float diameter = 10.0f;
    /**
     * 增长行为，每次调用长度和半径增加一倍
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * 缩小行为，每次调用长度和半径减少一半
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }
}
