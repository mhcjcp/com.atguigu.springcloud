package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.serviceImpl.PaymentServiceImpl;


/**
 * @ClassName com.atguigu.springcloud.TestMybatis
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 21:05
 * @Version 1.0
 **/
public class TestMybatis {

//    @Autowired
//    private PaymentServiceImpl paymentService;

    public static void main(String[] args) {
        PaymentServiceImpl paymentService = new PaymentServiceImpl();
//        Payment paymentById = paymentService.getPaymentById(2L);
        Payment payment = new Payment();
        payment.setSerial("www");
        int creat = paymentService.creat(payment);
        System.out.println(creat);
//        System.out.println(paymentById);
    }

}
