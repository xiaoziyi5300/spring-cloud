package com.cn.user.service.controller;

import com.cn.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 * 用户服务
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    /***
     * 校验用户是否存在
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping("/selectUserByUserName")
    public boolean selectUserByUserName(@RequestParam("userName") String userName, @RequestParam(value = "passWord") String passWord){
      return  userService.selectUserByUserName(userName,passWord);
    }

    @RequestMapping("/testMethod")
    public String testMethod(@RequestParam("userName") String userName){
        if("zhangsan".equals(userName)){
            System.out.println("我来自user 服务");
            return "我来自user 服务";
        }
        return "";
    }
}
