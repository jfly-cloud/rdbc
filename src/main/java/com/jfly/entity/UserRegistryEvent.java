package com.jfly.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class UserRegistryEvent  extends ApplicationEvent {

    public UserRegistryEvent(Object source) {
        super(source);
    }
}
