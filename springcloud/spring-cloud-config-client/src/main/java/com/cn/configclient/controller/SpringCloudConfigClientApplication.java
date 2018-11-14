package com.cn.configclient.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: lzf
 * @Date: 2018/11/14 0014 15:22
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }


    @Bean
    @ConfigurationProperties(prefix = "uat")
    public ConfigBean connectionSettings() {
        return new ConfigBean();

    }
}
