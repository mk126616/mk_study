package com.controller;


import com.entity.PaymentEntity;
import com.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController
{
    /**
     * 支付微服务的url
     */
    private final String PAYMENT_URL = "http://payment-service";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 创建订单
     *
     * @param paymentEntity
     * @return
     */
    @PostMapping("/consumer/payment")
    Result createPayment(PaymentEntity paymentEntity)
    {
        return restTemplate.postForObject(PAYMENT_URL+"/payment",paymentEntity,Result.class);
    }

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("/consumer/payments")
    Result getAllPayment()
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payments",Result.class);
    }

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("/consumer/payments2")
    Result getAllPayment2()
    {
       ResponseEntity<Result> responseEntity = restTemplate.getForEntity(PAYMENT_URL+"/payments", Result.class);
       if(responseEntity.getStatusCode().is2xxSuccessful()){
           return responseEntity.getBody();
       }else{
           return Result.error();
       }
    }
}
