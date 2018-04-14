package com.cn.mq.service;

import javax.jms.Destination;

/**
 * @author lzf
 * desc
 * date 2018/4/5-15:17-04
 */
public interface ProductService {

    void sendMessage(final String message);
}
