package com.cn.user.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.cn.user.service.mapper")
@EnableEurekaClient
public class SpringEurkaUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurkaUserServiceApplication.class, args);
	}
}
