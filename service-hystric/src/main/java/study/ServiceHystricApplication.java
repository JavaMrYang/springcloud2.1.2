package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  16:46
 * @Version 1.0
 * @EnableHystrix开启hystric
 **/
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class ServiceHystricApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHystricApplication.class,args);
    }
}
