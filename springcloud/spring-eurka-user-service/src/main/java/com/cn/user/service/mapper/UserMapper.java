package com.cn.user.service.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author lzf
 * @date 2018-06-25
 * @desc
 */
public interface UserMapper {
    int selectUserByUserName(@Param("userName") String userName, @Param("passWord") String passWord);
}
