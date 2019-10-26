package com.wyg.spring5.demo1.test;

import com.wyg.spring5.demo1.annotation.HelloWorldConfiguration;
import com.wyg.spring5.demo1.inter.MessageRenderer;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test01 {
    /**
     * 从xml中读取方式一
     */
    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
//        MessageRenderer render = (MessageRenderer) ctx.getBean("render");
        MessageRenderer render = ctx.getBean("render", MessageRenderer.class);
        render.render();
    }

    /**
     *从xml中读取方式二
     */
    @Test
    public void test03(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("spring/app-context.xml"));
        MessageRenderer render = factory.getBean("render", MessageRenderer.class);
        render.render();

    }

    /**
     * 从xml中读取方式三
     */
    @Test
    public void test04(){
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/app-context.xml");
        context.refresh();
        MessageRenderer render = context.getBean("render", MessageRenderer.class);
        render.render();

        context.close();
    }

    /**
     * 从注解类中读取
     */
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer render = ctx.getBean("render", MessageRenderer.class);
        render.render();
    }

}
