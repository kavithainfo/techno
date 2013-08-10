package com.kavi.learnspring.constructorInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kavi.learnspring.constructorInjection.CountryConstructorDI;

public class CountryConstructorDITest
{
    private final ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans-config.xml");
    private final CountryConstructorDI countryObj = (CountryConstructorDI)beanFactory.getBean("countryConstructorDIBean");

    @Test
    public void testgetName()
    {
        assertEquals("United Kingdom", countryObj.getName());
    }

    @Test
    public void testgetCaptialName()
    {
        assertEquals("London", countryObj.getCapital().getName());
    }

}
