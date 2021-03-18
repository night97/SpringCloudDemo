package com.sunight.securityclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述: 注册中心客户端
 *
 * @author sunight
 * @date 2021/3/17
 */
@EnableEurekaClient
@SpringBootApplication
public class SecurityClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityClientApplication.class, args);
    }

}
