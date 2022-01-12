package com.service;

import com.entity.PaymentEntity;
import com.entity.Result;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceErrorHandler implements PaymentService
{
    @Override
    public Result createPayment(PaymentEntity entity)
    {
        return new Result<>("500", "服务提供方出错:createPayment", null);
    }

    @Override
    public Result getAllPaymentOk()
    {
        return new Result<>("500", "服务提供方出错:getAllPaymentOk", null);
    }

    @Override
    public Result getAllPaymentError()
    {
        return new Result<>("500", "服务提供方出错:getAllPaymentError", null);
    }
}
