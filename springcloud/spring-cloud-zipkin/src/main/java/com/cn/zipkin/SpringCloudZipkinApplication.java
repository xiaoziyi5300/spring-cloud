package com.cn.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZipkinApplication.class, args);
	}
}
