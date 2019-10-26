package com.wyg.spring5.demo2.inter.impl;

import com.wyg.spring5.demo2.inter.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
