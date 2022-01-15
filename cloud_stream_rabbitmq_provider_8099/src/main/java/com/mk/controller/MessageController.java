package com.mk.controller;

import com.mk.entity.Result;
import com.mk.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    @Autowired
    private MessageService service;
    @RequestMapping("/sendMessage/{msg}")
    public Result sendMessage(@PathVariable String msg){
        return service.sendMessage(msg);
    }
}
