package com.wyg.spring5.demo1.inter.impl;

import com.wyg.spring5.demo1.inter.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
