package com.service;

import com.entity.PaymentEntity;
import com.entity.Result;
import com.mapper.PaymentMapper;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@DefaultProperties(defaultFallback = "getAllPaymentErrorHandler") //指定此类中需要进行降级处理方法统一的兜底方法
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
            return Result.success(mapper.getAllPayment());
        }
        catch (Exception e)
        {
            return Result.error();
        }

    }

    //    /**
    //     * 服务降级
    //     * @return
    //     */
    //    @HystrixCommand(fallbackMethod = "getAllPaymentErrorHandler", commandProperties = {
    //            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    //    })
    //    @HystrixCommand //标识此方法需要在出现问题时进行降级处理
    //    @Override
    //    public Result<List<PaymentEntity>> getAllPaymentError()
    //    {
    //        try
    //        {
    //            int a = 10/0;
    //            Thread.sleep(8000);
    //            return Result.success(mapper.getAllPayment());
    //        }
    //        catch (Exception e)
    //        {
    //            return Result.error();
    //        }
    //    }

    /**
     * 服务熔断
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "getAllPaymentErrorHandler",
            commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            //时间窗口内总请求数量
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            //时间窗口时间
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            //时间窗口内出错比例
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    @Override
    public Result<List<PaymentEntity>> getAllPaymentError(Integer id)
    {
        if(id < 0){
           throw new RuntimeException("参数不能小于0");
        }
        List<PaymentEntity> allPayment = mapper.getAllPayment();
        return Result.success(allPayment);
    }

    public Result<List<PaymentEntity>> getAllPaymentErrorHandler(Integer id)
    {
        return new Result<>("500", "服务提供方出错", null);
    }
}
