package com.cn.mq.service.impl;

import com.cn.mq.service.ProductService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author lzf
 * desc
 * date 2018/4/5-15:19-04
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination="out.queue")
    public void consumerMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }
    @Override
    public void sendMessage(String message) {
        Destination destination = new ActiveMQQueue("mytest.queue");
        for(int i=0;i<10;i++){
            jmsMessagingTemplate.convertAndSend(destination, message+i);
        }
    }
}
