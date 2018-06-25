package com.cn.user.service.service.impl;

import com.cn.user.service.mapper.UserMapper;
import com.cn.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean selectUserByUserName(String userName, String passWord) {
        int count = userMapper.selectUserByUserName(userName, passWord);
        if(count > 0){
            return true;
        }
        return false;
    }
}
