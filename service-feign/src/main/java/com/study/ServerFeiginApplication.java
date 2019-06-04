package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  17:00
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServerFeiginApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerFeiginApplication.class,args);
    }
}
