package com.nj.cqx.dns;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * DNSService
 * Author: chenqingxia
 * Date: 2017/10/30
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public final class DNSService {

    /**
     * @param serverAddr DNS地址
     * @param timeOut 连接超时时间
     * @param type 查询类型
     * @param address 查询地址
     * @return
     */
    //通过Java实现域名解析，可以解析各种记录：A记录、NS记录、别名记录(CNAME)等。
    public static List<String> search(String serverAddr, int timeOut,
                                      String type, String address) {
        InitialDirContext context = null;
        List<String> resultList = new ArrayList<String>();
        try {
            Hashtable<String, String> env = new Hashtable<String, String>();
            env.put("java.naming.factory.initial",
                    "com.sun.jndi.dns.DnsContextFactory");
            env.put("java.naming.provider.url", "dns://" + serverAddr + "/");
            env.put("com.sun.jndi.ldap.read.timeout", String.valueOf(timeOut));
            context = new InitialDirContext(env);
            String dns_attrs[] = { type };

            Attributes attrs = context.getAttributes(address, dns_attrs);
            Attribute attr = attrs.get(type);
            if (attr != null) {
                for (int i = 0; i < attr.size(); i++) {
                    resultList.add((String) attr.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(context!=null){
                try {
                    context.close();
                } catch (NamingException e) {

                }
            }
        }
        return resultList;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        List<String> resultList = search("202.106.0.20", 2000, "A","www.baidu.com");
        for(String str : resultList){
            System.out.println(str);
        }
    }

}