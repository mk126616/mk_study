package com.mk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope //刷新配置中心的配置
@RestController
public class ConfigController
{
    @Value("${custom.key}")
    private String cloudConfigValue;
    @Value("${custom.version}")
    private String version;

    @RequestMapping("/config")
    public  String getConfig(){
        return cloudConfigValue+"_"+version;
    }
}
