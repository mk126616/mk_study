package com.mk.controller;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding({Sink.class})
public class MessageController
{
    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message msg){
        System.out.println("接收到消息："+msg.getPayload());
    }
}
