package com.cn.user.ui.eventTest;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: lzf
 * @Date: 2018/11/21 0021 14:59
 * @Description:
 */
@Component
public class TestLister implements ApplicationListener<TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        System.out.println("111111111111");
        testEvent.testPrint();
    }
}
