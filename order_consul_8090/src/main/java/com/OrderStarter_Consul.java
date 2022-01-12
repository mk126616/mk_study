package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient  //标识为服务注册中心的客户端
@SpringBootApplication
public class OrderStarter_Consul
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderStarter_Consul.class, args);
    }
}
