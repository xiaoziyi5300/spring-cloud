package com.cn.spring.cloud.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther: lzf
 * @Date: 2018/10/10 0010 10:39
 * @Description:
 */
@Controller
@RequestMapping("config")
public class ConfigController {

    @Value("${port:4040}")
    private String useLocalCache;

    public static void main(String[] args) {
        String url = "http://hengqinlife-test.e-hqins.com/productDetailNew?productId=10019&activity=eyJhY3Rpdml0eUlkIjoiY29udmVudGlvbmFsIiwiY2hhbm5lbE5vIjoiMTYifQ%3D%3D";
        System.out.println(URLDecoder.decode(url));
    }

    public void setUseLocalCache(String useLocalCache) {
        this.useLocalCache = useLocalCache;
    }

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public String get() {
        return useLocalCache;
    }
}
