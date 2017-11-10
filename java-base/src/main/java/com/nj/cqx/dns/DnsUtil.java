package com.nj.cqx.dns;

import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * DnsUtil
 * Author: chenqingxia
 * Date: 2017/10/27
 */
public class DnsUtil {
    //通过Java实现域名解析，可以解析各种记录：A记录、NS记录、别名记录(CNAME)等。
    public static List<String> search(String serverAddress, int timeOut, String type, String address) {
        InitialDirContext context = null;
        List<String> resultList = new ArrayList<>();
        try {
            Hashtable<String, String> env = new Hashtable<>();
            env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            env.put("java.naming.provider.url", "dns://" + serverAddress + "/");
            env.put("com.sun.jndi.ldap.read.timeout", String.valueOf(timeOut));
            context = new InitialDirContext(env);
            String dns_attrs[] = {type};

            Attributes attrs = context.getAttributes(address, dns_attrs);
            Attribute attr = attrs.get(type);
            if (attr != null) {
                for (int i = 0; i < attr.size(); i++) {
                    resultList.add((String) attr.get(i));
                }
            }
        } catch (Exception e) {
        } finally {
            if (context != null) {
                try {
                    context.close();
                } catch (NamingException e) {
                }
            }
        }
        return resultList;
    }
    public static void main(String[] args) throws Exception {
        List<String> resultList = DnsUtil.search("114.114.114.114", 2000, "A", "www.njxyqb.com");//NS
        for (String str : resultList) {
            System.out.println(str);
        }
    }
}
