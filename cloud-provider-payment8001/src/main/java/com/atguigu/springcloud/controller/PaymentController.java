package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.serviceImpl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author m
 * @Date 2022/10/26 20:52
 * @Version 1.0
 **/
@RestController   //此时前后分离 后端只需给前端传达执行状态  所有@Rest  相当于@ResopnseBody,传回json数据
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){ //此时通过postman直接访问8001端口报错，原因是此时接收的数据是json 而？serial=xxx这种格式并不支持，所以报错
        log.info("payment是：{}",payment);
        int result = paymentService.creat(payment);
//        log.info("*******"+result);
        log.info("**********插入结果：{}",result);
        if (result>0){
            return new CommonResult<>(200,"插入数据库成功",result);
        }
        return new CommonResult<>(444,"插入数据库失败",result);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment= paymentService.getPaymentById(id);
//        log.info("*******"+result);
        log.info("**********查询结果是：{}",payment);
        if (payment!=null){
            return new CommonResult<>(200,"查询成功",payment);
        }
        return new CommonResult<>(444,"没有对应记录，查询失败",null);
    }
}
