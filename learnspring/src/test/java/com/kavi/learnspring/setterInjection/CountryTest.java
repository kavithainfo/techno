package com.kavi.learnspring.setterInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kavi.learnspring.setterInjection.Country;

public class CountryTest
{
    private final ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans-config.xml");
    private final Country countryObj = (Country)beanFactory.getBean("countryBean");

    @Test
    public void testgetName()
    {
        assertEquals("UK", countryObj.getName());
    }

    @Test
    public void testgetCaptialName()
    {
        assertEquals("London", countryObj.getCapital().getName());
    }

    @Test
    public void testgetStatesNames()
    {
        assertEquals("Aberdeen", countryObj.getStates().get(0));
        assertEquals("Glasgow", countryObj.getStates().get(1));
        assertEquals("Edinburgh", countryObj.getStates().get(2));
    }

}
