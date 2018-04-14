package com.cn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzf
 * desc
 * date 2018/4/14-11:00
 */
@RestController
public class SpringCloudConfigController {

    @Value("${foo}")
    private String foo;//获取config 服务获取的配置的值

    @RequestMapping("/test")
    public String test() {
        return foo;
    }
}
