package com.cn.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurkaUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurkaUserServiceApplication.class, args);
	}
}
