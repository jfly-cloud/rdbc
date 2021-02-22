package com.jfly.service.impl;

import com.jfly.entity.UserRegistryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl  {

    @EventListener
    public void email(UserRegistryEvent  userRegistryEvent) {
        System.out.println("------------->用户注册发送邮件："+userRegistryEvent.getSource());
    }
}
