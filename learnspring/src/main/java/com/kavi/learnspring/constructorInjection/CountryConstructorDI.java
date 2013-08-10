package com.kavi.learnspring.constructorInjection;

import com.kavi.learnspring.setterInjection.Capital;

public class CountryConstructorDI
{
    private final String name;
    private final Capital capital;

    public CountryConstructorDI(String name, Capital capital)
    {
        this.name = name;
        this.capital = capital;
    }

    public String getName()
    {
        return name;
    }

    public Capital getCapital()
    {
        return capital;
    }

}
