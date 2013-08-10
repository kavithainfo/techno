package com.kavi.learnspring.setterInjection;

import java.util.List;


public class Country
{
    private String name;
    private Capital capital;
    List<String> states;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setCapital(Capital capital)
    {
        this.capital = capital;
    }

    public Capital getCapital()
    {
        return capital;
    }

    public void setStates(List<String> states)
    {
        this.states = states;
    }

    public List<String> getStates()
    {
        return states;
    }
}
