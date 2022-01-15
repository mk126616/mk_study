package com.mk.service;

import com.mk.entity.PaymentEntity;
import com.mk.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "payment-service",fallback=PaymentServiceErrorHandler.class)
public interface PaymentService
{
    /**
     * 创建订单
     *
     * @param entity
     * @return
     */
    @PostMapping("/payment")
    Result createPayment(PaymentEntity entity);

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("paymentsOk")
    Result getAllPaymentOk();

    /**
     * 所有订单
     *
     * @return
     */
    @GetMapping("paymentsError")
    Result getAllPaymentError();
}
