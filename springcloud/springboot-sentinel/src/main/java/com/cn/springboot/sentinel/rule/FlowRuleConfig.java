package com.cn.springboot.sentinel.rule;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzf
 * desc
 * date 2019/7/11-17:21
 */
@Configuration
public class FlowRuleConfig {

    @Bean
    public FlowRuleManager initFlowQpsRule() {
        FlowRuleManager flowRuleManager = new FlowRuleManager();
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule("flowTest");
        // set limit qps to 20
        rule.setCount(2);
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setLimitApp("default");
        rules.add(rule);
        flowRuleManager.loadRules(rules);
        return flowRuleManager;
    }

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
