package com.cn.spring.cloud.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述:
 *
 * @param:
 * @return: 测试整合 nacos
 * @auther: lzf
 * @date: 2018/10/10 0010 10:31
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", groupId = "", autoRefreshed = true)
public class SpringCloudNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosApplication.class, args);
    }
}
