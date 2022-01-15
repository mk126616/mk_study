package com.mk.service;

import com.mk.entity.Result;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageServiceImpl implements MessageService
{
    @Resource  //默认按照名称注入，没有找到则按照类型注入
    private MessageChannel output;

    @Override
    public Result sendMessage(String msg)
    {
        return Result.success(output.send(MessageBuilder.withPayload(msg).build()));
    }
}
