package com.configration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig
{
    /**
     * 创建网关的路由
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder)
    {
        RouteLocatorBuilder.Builder routes = builder.routes();
        RouteLocator routeLocator = routes.route("baidu", r -> r.path("/guonei").uri("https://news.baidu.com")).build();
        return routeLocator;
    }
}
