package com.wyg.spring5.demo1.inter.impl;

import com.wyg.spring5.demo1.inter.MessageProvider;
import com.wyg.spring5.demo1.inter.MessageRenderer;

public class StandarOutMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException("provider不能为null");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
