package com.cn.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzf
 * desc
 * date 2018/4/16-9:53
 */
@RestController
@RefreshScope
public class TestController {

    @Autowired
    ConfigBean configBean;

    @Value("${uat.test}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo + " " + configBean.getName();
    }
}
