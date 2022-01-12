package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class Hystrix_dashboard_8094
{
    public static void main(String[] args)
    {
        SpringApplication.run(Hystrix_dashboard_8094.class,args);
    }
}
