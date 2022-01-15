package com.mk.service;

import com.mk.entity.Result;
import com.mk.entity.PaymentEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentService
{
    @GetMapping("payments")
    Result getAllPayment();

    @PostMapping("/payment")
    Result createPayment(PaymentEntity entity);
}
