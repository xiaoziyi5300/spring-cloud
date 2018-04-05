package com.cn.user.ui.service;

import com.cn.user.ui.serviceHiHystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 用户service
 *
 * SchedualServiceHiHystric 断路保护
 */
@FeignClient(value = "user-service",fallback = SchedualServiceHiHystric.class)
public interface UserService {
    /***
     * 校验用户是否存在
     * @return
     */
    @RequestMapping(value = "/user/selectUserByUserName",method = RequestMethod.GET)
    boolean selectUserByUserName(@RequestParam(value = "userName") String userName, @RequestParam(value = "passWord") String passWord);
    /*
    @RequestMapping(value = "/userControler/testInterface",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    String testInterface(@RequestBody User user);*/
}
