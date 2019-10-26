package com.wyg.spring5.demo2.test;

import com.wyg.spring5.demo2.inter.MessageRenderer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/app-context-annotation.xml");
        context.refresh();
        MessageRenderer render = context.getBean("renderer", MessageRenderer.class);
        render.render();

        context.close();
    }

    @Test
    public void test02(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context-annotation.xml");
//        MessageRenderer render = (MessageRenderer) ctx.getBean("render");
        MessageRenderer render = ctx.getBean("renderer", MessageRenderer.class);
        render.render();
    }
}
