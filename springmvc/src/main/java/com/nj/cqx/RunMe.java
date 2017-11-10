package com.nj.cqx;

import com.nj.cqx.webservice.OpenAPIWebService;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * RunMe
 * Author: chenqingxia
 * Date: 2017/10/26
 */
public class RunMe {
    private static final String testUrl = "http://localhost:8080/ws/OpenApi?wsdl";
    public static void main(String[] args) throws Exception {

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.setServiceClass(OpenAPIWebService.class);
        factoryBean.setAddress(testUrl);
//        factoryBean.setUsername("");
//        factoryBean.setPassword("");
        OpenAPIWebService impl = (OpenAPIWebService) factoryBean.create();
        System.out.println(impl.say("192.168.1.1"));
    }
}
