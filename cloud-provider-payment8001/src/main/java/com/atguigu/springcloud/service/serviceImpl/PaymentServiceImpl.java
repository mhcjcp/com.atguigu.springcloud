package com.atguigu.springcloud.service.serviceImpl;


import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 20:49
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
