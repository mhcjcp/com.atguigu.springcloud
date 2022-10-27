package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PagmentDao
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 20:13
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {

    //写操作
    public int creat(Payment payment);
    //读操作
    public Payment getPaymentById(@Param("id") Long id);
}
