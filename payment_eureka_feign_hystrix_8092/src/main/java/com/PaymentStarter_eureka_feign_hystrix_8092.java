package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix   //开启降级、熔断功能
@EnableEurekaClient //标识为eureka客户端
@MapperScan(basePackages = {"com.mk.mapper"})
@SpringBootApplication
public class PaymentStarter_eureka_feign_hystrix_8092
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentStarter_eureka_feign_hystrix_8092.class, args);
    }
}
