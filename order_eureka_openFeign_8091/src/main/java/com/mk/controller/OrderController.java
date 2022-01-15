package com.mk.controller;

import com.mk.entity.PaymentEntity;
import com.mk.entity.Result;
import com.mk.service.PaymentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController implements ApplicationContextAware
{
    /**
     * 支付微服务的url
     */
    private final String PAYMENT_URL = "http://PAYMENT-SERVICE";


    private ApplicationContext context;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PaymentService paymentService;
    /**
     * 创建订单
     *
     * @param paymentEntity
     * @return
     */
    @PostMapping("/consumer/payment")
    Result createPayment(PaymentEntity paymentEntity)
    {
        return paymentService.createPayment(paymentEntity);
    }

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("/consumer/payments")
    Result getAllPayment()
    {
       return paymentService.getAllPayment();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.context = applicationContext;
    }
}
