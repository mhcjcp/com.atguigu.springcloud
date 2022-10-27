package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author m
 * @Date 2022/10/27 15:13
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
