package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OrderStarter_Eureka_openfeign_8091
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderStarter_Eureka_openfeign_8091.class, args);
    }
}
