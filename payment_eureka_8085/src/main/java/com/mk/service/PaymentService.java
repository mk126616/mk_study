package com.mk.service;

import com.mk.entity.Result;
import com.mk.entity.PaymentEntity;

public interface PaymentService
{
    Result createPayment(PaymentEntity entity);

    Result getAllPayment();
}
