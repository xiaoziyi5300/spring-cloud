package com.cn.user.ui.eventTest;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: lzf
 * @Date: 2018/11/21 0021 14:05
 * @Description:
 */
public class TestEvent extends ApplicationEvent {

    private String message;

    public TestEvent(Object source) {
        super(source);
    }


    public TestEvent(Object source, String msg) {
        super(source);
        this.message = msg;
    }

    public void testPrint() {
        System.out.println("测试打印  " + this.message);
    }

}