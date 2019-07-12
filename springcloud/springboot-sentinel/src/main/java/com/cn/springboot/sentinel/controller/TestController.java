package com.cn.springboot.sentinel.controller;

import com.cn.springboot.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzf
 * desc
 * date 2019/7/11-17:44
 */
@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping(value = "/hello")
    public String hello() {
        return testService.test();
    }
}
