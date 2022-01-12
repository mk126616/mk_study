package com.service;

import com.entity.PaymentEntity;
import com.entity.Result;

public interface PaymentService
{
    Result createPayment(PaymentEntity entity);

    Result getAllPayment();
}
