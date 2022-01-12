package com.configration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig
{
    /**
     * rest请求便捷操作工具
     * @return
     */
    @Bean
    @LoadBalanced //赋予template负载均衡的能力（加此注解后在发送请求时会被拦截器拦截，并去注册中心获取一个服务具体的地址，然后请求这个实际的地址）
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
