package com.cn.user.service.service.impl;

import com.cn.user.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

   /* @Resource
    private UserMapper uiserMapper;*/

    @Override
    public boolean selectUserByUserName(String userName, String passWord) {
     /*   int count =  uiserMapper.selectUserByUserName(userName,passWord);
        if(count > 0){
            return true;
        }
        return false;*/
       return true;
    }
}
