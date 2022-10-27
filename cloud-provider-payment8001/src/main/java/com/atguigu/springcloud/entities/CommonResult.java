package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ClassName CommonResult
 * @Description TODO Json封装体
 * @Author m
 * @Date 2022/10/26 20:09
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
//        this.code=code;
//        this.message=message;
        this(code,message,null);
    }
}
