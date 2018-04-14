package com.cn.mq.controller;

import com.cn.mq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/***
 * 测试mq
 */
@RestController
@RequestMapping("product/mq")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/testQuenueMessage")
    public String sendMessage(){
        productService.sendMessage("测试队列信息");
        return "success";
    }
}
