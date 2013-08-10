package com.kavi.learnspring.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldMain
{

    public static void main(String[] args)
    {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans-config.xml");
        HelloWorld helloWorldObj = (HelloWorld)beanFactory.getBean("helloWorldBean");
        System.out.println(helloWorldObj.getName());
    }

}
