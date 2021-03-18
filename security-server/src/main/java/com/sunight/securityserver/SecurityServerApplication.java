package com.sunight.securityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述: 注册中心服务端
 *
 * @author subai
 * @date 2021/3/17
 */
@EnableEurekaServer
@SpringBootApplication
public class SecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityServerApplication.class, args);
    }

}
