package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //标识为eureka客户端
@MapperScan(basePackages = {"com.mk.mapper"})
@SpringBootApplication
public class PaymentStarter_eureka_8081
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentStarter_eureka_8081.class, args);
    }
}
