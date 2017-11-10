package com.nj.cqx.j8.demo;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * GoodDisplay
 * Author: chenqingxia
 * Date: 2017/10/30
 */
public class GoodDisplay {
    String goodId;
    String goodName;
    String goodPic;

    public GoodDisplay(String goodId, String goodName, String goodPic) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPic = goodPic;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodPic() {
        return goodPic;
    }

    public void setGoodPic(String goodPic) {
        this.goodPic = goodPic;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
}
