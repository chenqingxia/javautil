package com.nj.cqx;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * testController
 * Author: chenqingxia
 * Date: 2017/9/27
 */
@Controller
@RequestMapping(value = "/api")
public class testController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(String s) {
        return s;
    }
}
