package com.kavi.learnspring.setterInjection;

public class HelloWorld
{
    // created and injected by IOC container
    public String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void print()
    {
        System.out.println(name);
    }

}
