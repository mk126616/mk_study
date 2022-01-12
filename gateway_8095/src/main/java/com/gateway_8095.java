package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //标识为eureka客户端
@SpringBootApplication
public class gateway_8095
{
    public static void main(String[] args)
    {
        SpringApplication.run(gateway_8095.class, args);
    }
}
