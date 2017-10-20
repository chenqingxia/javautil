package rule;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * App
 * Author: chenqingxia
 * Date: 2017/10/20
 */
public class App {
//    1 规则是一个interface接口，里面有俩函数：一个用来判断条件是否达成，返回true/false，另一个是如果返回是true，则执行一些动作修改某些值
//    2 如果有多条规则，手工指定下规则的优先级，这样可以让若干规则以按照优先级次序逐个执行。
    public static void main( String[] args )
    {
        // create facts
        Long flow=3000L;
        Facts facts = new Facts();
        facts.put("flow",flow);
        // create rules
        Rules rules = new Rules();
        rules.register(new HelloWorldRule2());

        // create a rules engine and fire rules on known facts
        RulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);
    }
}
