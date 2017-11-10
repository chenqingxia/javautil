package com.nj.cqx.webservice;


import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * testController
 * Author: chenqingxia
 * Date: 2017/9/27
 */
@Service
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class OpenAPIWebService {


    @WebMethod
    public String say(String hello) {
        //for testing
        return "say : " + hello;
    }
}