package com.cn.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMqApplication.class, args);
	}
}
