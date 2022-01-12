package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = {"com.mk.mapper"})
@SpringBootApplication
@EnableDiscoveryClient  //服务注册客户端标识
public class PaymentStarter8087_Zookeeper
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentStarter8087_Zookeeper.class, args);
    }
}
