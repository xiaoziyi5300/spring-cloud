package com.cn.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: lzf
 * @Date: 2018/9/14 0014 14:24
 * @Description:
 */
@Controller
public class TestController {


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login_page")
    public String test_method() {
        return "login";
    }

    @RequestMapping("/success")
    public String success() {
        return "privilege";
    }

    @RequestMapping("/error_page")
    public String error() {
        return "error";
    }

    @RequestMapping("/test_methond")
    public String test_methond() {
        return "ceshi";
    }
}
