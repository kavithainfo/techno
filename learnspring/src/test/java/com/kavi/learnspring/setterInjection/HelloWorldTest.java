package com.kavi.learnspring.setterInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kavi.learnspring.setterInjection.HelloWorld;

public class HelloWorldTest
{

    private final ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans-config.xml");
    private final HelloWorld helloWorldObj = (HelloWorld)beanFactory.getBean("helloWorldBean");

    @Test
    public void testgetName()
    {
        assertEquals("Kavitha", helloWorldObj.getName());
    }


}
