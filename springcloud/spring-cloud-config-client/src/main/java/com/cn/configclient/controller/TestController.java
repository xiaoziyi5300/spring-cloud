package com.cn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzf
 * desc
 * date 2018/4/16-9:53
 */
@RestController
public class TestController {
    @Value("foo")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }
}
