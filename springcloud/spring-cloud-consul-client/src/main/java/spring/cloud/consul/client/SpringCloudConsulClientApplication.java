package spring.cloud.consul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulClientApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "hi ,i'm consul client";
    }
}
