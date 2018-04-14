package com.cn.mq.model;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author lzf
 * desc
 * date 2018/4/5-15:28
 */
@Component
public class Coustomer {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "mytest.queue")
    //SendTo 读到的值 再返回到out.queue中
    @SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.println("Consumer收到的报文为:"+text);
        return "return message"+text;
    }
}
