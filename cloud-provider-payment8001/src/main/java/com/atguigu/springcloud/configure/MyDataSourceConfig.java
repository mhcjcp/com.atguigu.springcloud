package com.atguigu.springcloud.configure;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @ClassName MyDataSourceConfig
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 21:56
 * @Version 1.0
 **/
//@Configuration
//public class MyDataSourceConfig {
//
//    @ConfigurationProperties("spring.datasource")
//    @Bean
//    public DataSource dataSource() throws SQLException {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        return druidDataSource;
//    }
//}
