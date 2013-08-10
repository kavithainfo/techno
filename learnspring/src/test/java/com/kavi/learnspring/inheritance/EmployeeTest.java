package com.kavi.learnspring.inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest
{
    private final ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans-config.xml");
    private final Employee employee = (Employee)beanFactory.getBean("employeeBean");

    @Test
    public void testgetId()
    {
        assertEquals(1289, employee.getId());
    }

    @Test
    public void testSpringInheritance()
    {
        assertEquals("John", employee.getName());
    }


}
