package com.cn.user.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/***
 * EnableDiscoveryClient eurka 客户端
 * EnableFeignClients 表名feign 客户端
 * EnableHystrixDashboard 开始断路器仪表盘
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
public class SpringEurkaUserUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurkaUserUiApplication.class, args);
	}
}
