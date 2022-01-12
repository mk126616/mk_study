package com.configration;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义负载均衡实现接口
 */
public interface LoadBalancer
{
    ServiceInstance choose(List<ServiceInstance> serviceInstances) throws Exception;
}
