package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain
 * @Description TODO
 * @Author m
 * @Date 2022/10/27 15:07
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
