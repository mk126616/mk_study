package com.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Spring_cloud_config_client_8098
{
    public static void main(String[] args)
    {
        SpringApplication.run(Spring_cloud_config_client_8098.class,args);
    }
}
