package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaMain7001
 * @Description TODO
 * @Author m
 * @Date 2022/10/27 16:29
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer  //我是Eureka注册中心
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
