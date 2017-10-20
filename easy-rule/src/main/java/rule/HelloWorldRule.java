package rule;

import com.alibaba.fastjson.JSON;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * HelloWorldRule
 * Author: chenqingxia
 * Date: 2017/10/20
 */
@Rule(name = "Hello World rule", description = "Always say hello world")
public class HelloWorldRule {
    private String value;
    private Boolean istrue;
    public HelloWorldRule(String value,Boolean istrue){
        this.value=value;
        this.istrue=istrue;
    }

    @Condition
    public boolean when() {
        if(value!=null&&!value.equals("")){
            return true;
        }
        return false;
    }

    @Action
    public void then() throws Exception {
        System.out.println("hello world");
    }
    @Action(order = 1)
    public void second() throws Exception {
        System.out.println("second");
    }

    @Action(order = 2)
    public void third() throws Exception {
        //my final actions
        System.out.println("third");
    }
}
