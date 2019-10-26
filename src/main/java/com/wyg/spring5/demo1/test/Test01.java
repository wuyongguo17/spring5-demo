package com.wyg.spring5.demo1.test;

import com.wyg.spring5.demo1.inter.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
//        MessageRenderer render = (MessageRenderer) ctx.getBean("render");
        MessageRenderer render = ctx.getBean("render", MessageRenderer.class);
        render.render();
    }
}
