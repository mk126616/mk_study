package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //会帮我们注册服务的发现到ioc中：DiscoveryClient（微服务的发现客户端）
@SpringBootApplication
//@RibbonClient(name = "PAYMENT-SERVICE",configuration = RibbonConfig.class) //PAYMENT-SERVICE服务使用单独的负载均衡算法
public class OrderStarter_Eureka_8082
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderStarter_Eureka_8082.class, args);
    }
}
