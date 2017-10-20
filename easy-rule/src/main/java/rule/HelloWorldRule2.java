package rule;

import com.alibaba.fastjson.JSON;
import org.jeasy.rules.annotation.*;
import org.jeasy.rules.api.Facts;

/**
 * Copyright (C), 2015-2016 中盈优创
 * HelloWorldRule
 * Author: 龚健
 * Date: 2017/6/13
 */
//name 标示一个rule的集合  每个rule的name + description + priority 为默认的 hashCode和 compareTo 默认若不修改无法添加多条Rule
//默认rule内部使用TreeSet  Fact为参数集合  Rule为规则集合  ,合并rule需继承 CompositeRule 当全部规则通过后执行Action 需设置withSkipOnFirstAppliedRule=true
@Rule(name = "HelloWorldRule2", description = "注解方式规则示例")
public class HelloWorldRule2 {

    @Condition//只有一个方法可以加Condition
    public boolean when(@Fact("flow") Long currentFlow) {//提取fact属性key
        if (currentFlow > 1000) {
            return true;
        }
        return false;
    }

    @Action//默认order为0
    public void first() throws Exception {
        System.out.println("first");
    }

    @Action(order = 1)
    public void second(Facts facts) throws Exception {
        System.out.println("second" + JSON.toJSONString(facts));
        facts.put("flow", 3000l);
    }

    @Action(order = 2)
    public void third() throws Exception {
        //my final actions
        System.out.println("third");
    }

    @Priority
    public int ruleOrder() {
        //Rule执行顺序  非指定则为添加时顺序
        return 10;
    }

}