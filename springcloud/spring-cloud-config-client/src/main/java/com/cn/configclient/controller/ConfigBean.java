package com.cn.configclient.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Auther: lzf
 * @Date: 2018/11/14 0014 15:37
 * @Description:
 */
@Cacheable
@ConfigurationProperties(prefix = "uat")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfigBean {

    private String test;
    private String name;
    private String age;
}
