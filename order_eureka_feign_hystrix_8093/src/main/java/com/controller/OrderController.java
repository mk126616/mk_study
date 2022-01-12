package com.controller;


import com.entity.PaymentEntity;
import com.entity.Result;
import com.service.PaymentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class OrderController implements ApplicationContextAware
{
    /**
     * 支付微服务的url
     */
    private final String PAYMENT_URL = "http://PAYMENT-SERVICE";

    @Autowired
    private PaymentService paymentService;

    private ApplicationContext context;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 创建订单
     *
     * @param entity
     * @return
     */
    @PostMapping("/consumer/payment")
    public Result createPayment(PaymentEntity entity)
    {
        return paymentService.createPayment(entity);
    }

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("/consumer/paymentsOk")
    public Result getAllPaymentOk()
    {
        Result<List<PaymentEntity>> result = paymentService.getAllPaymentOk();
        return result;
    }

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("/consumer/paymentsError")
    public Result getAllPaymentError()
    {
        Result<List<PaymentEntity>> result = null;
        result = paymentService.getAllPaymentError();
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.context = applicationContext;
    }
}
