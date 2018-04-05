package com.cn.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurkaServerApplication.class, args);
	}
}
