package com.cn.user.ui.serviceHiHystric;

import com.cn.user.ui.service.UserService;
import org.springframework.stereotype.Component;

/***
 * 断路器Bean
 */
@Component
public class SchedualServiceHiHystric implements UserService {

    @Override
    public boolean selectUserByUserName(String userName, String passWord) {
        System.out.println("用户服务处问题啦");
        return false;
    }
}
