package com.service;

import com.entity.PaymentEntity;
import com.entity.Result;
import com.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentMapper mapper;

    @Override
    public Result<Integer> createPayment(PaymentEntity entity)
    {
        int count = mapper.createPayment(entity);
        if (count > 0)
        {
            return Result.success(count);
        }
        return Result.error();
    }

    @Override
    public Result<List<PaymentEntity>> getAllPayment()
    {
        try
        {
            Thread.sleep(3000);
            return Result.success(mapper.getAllPayment());
        }
        catch (Exception e)
        {
            return Result.error();
        }

    }
}
