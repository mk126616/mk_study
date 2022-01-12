package com.com.mk.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign的日志配置对象创建
 */
@Configuration
public class FeignLog
{
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.FULL;
    }
}
