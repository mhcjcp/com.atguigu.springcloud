package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 20:07
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
