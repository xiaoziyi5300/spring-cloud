package com.cn.user.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: lzf
 * @Date: 2018/11/27 0027 14:50
 * @Description:
 */
@RestController
@RequestMapping("/v1")
public class DemoController {

    @RequestMapping(value = "/testRequest", method = RequestMethod.GET)
    public String testRequest(HttpServletRequest request) {
        int serverPort = request.getServerPort();
        return serverPort + "为您服务";
    }
}
