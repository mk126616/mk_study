package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient //会帮我们注册服务的发现到ioc中：DiscoveryClient（微服务的发现客户端）
@SpringBootApplication
public class Order_eureka_feign_hystrix_8093
{
    public static void main(String[] args)
    {
        SpringApplication.run(Order_eureka_feign_hystrix_8093.class, args);
    }
}
