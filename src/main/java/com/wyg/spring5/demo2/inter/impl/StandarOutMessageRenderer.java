package com.wyg.spring5.demo2.inter.impl;

import com.wyg.spring5.demo2.inter.MessageProvider;
import com.wyg.spring5.demo2.inter.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandarOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException("provider不能为null");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Autowired
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
