package com.wzy.study.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient    // EnableDiscoveryClient EnableEurekaClient 作用差不多，但EnableEurekaClient 只能用在eureka 做注册中心的微服务中
public class DesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);
    }

}
