package com.wyg.spring5.demo1.annotation;

import com.wyg.spring5.demo1.inter.MessageProvider;
import com.wyg.spring5.demo1.inter.MessageRenderer;
import com.wyg.spring5.demo1.inter.impl.HelloWorldMessageProvider;
import com.wyg.spring5.demo1.inter.impl.StandarOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean("render")
    public MessageRenderer renderer(){
        StandarOutMessageRenderer renderer = new StandarOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
