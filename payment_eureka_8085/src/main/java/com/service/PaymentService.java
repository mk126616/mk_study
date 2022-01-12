package com.service;

import com.entity.Result;
import com.entity.PaymentEntity;

public interface PaymentService
{
    Result createPayment(PaymentEntity entity);

    Result getAllPayment();
}
