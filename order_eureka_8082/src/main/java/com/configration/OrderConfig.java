package com.configration;

import com.netflix.loadbalancer.IRule;
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
    //@LoadBalanced //赋予template负载均衡的能力（加此注解后在发送请求时会被拦截器拦截，
    // 并使用discoveryClient通过服务名去服务注册中心获取所有服务，调用IRule（负载均衡算法）获取一个具体的服务url，
    // 然后通过http调用此服务的url）
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
