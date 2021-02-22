package com.jfly.service.impl;

import com.jfly.entity.UserRegistryEvent;
import com.jfly.service.UserRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserRegistryServiceImpl implements UserRegistryService {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void userRegistry(String name) {
        System.out.println("------------->开始用户注册");
        applicationEventPublisher.publishEvent(new UserRegistryEvent(name));
        System.out.println("------------->用户注册完成");
    }
}
