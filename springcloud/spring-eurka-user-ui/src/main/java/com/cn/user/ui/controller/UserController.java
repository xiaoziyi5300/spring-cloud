package com.cn.user.ui.controller;

import com.cn.user.ui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/***
 * 用于用户登录登出页面
 */
@RestController
@RequestMapping("/apr/user")
public class UserController {


    @Autowired
    UserService userService;

    /***
     * 登录
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public ModelAndView login1(String userName, String passWord){
        ModelAndView mv = new ModelAndView();
        boolean flag = userService.selectUserByUserName(userName,passWord);
        if(!flag){
            System.out.println("用户名不存在");
            mv.setViewName("/user/login");
        }else{
            System.out.println("张三登录啦");
            mv.setViewName("/index");
        }
        return  mv;
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(String userName, String passWord){
        boolean flag = userService.selectUserByUserName(userName,passWord);
        if(!flag){
            return "用户名不存在";
        }else{
            return "张三登录啦";
        }
    }
}
