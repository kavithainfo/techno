package com.kavi.learnspring.inheritance;

public class Employee extends Person
{
    private int id;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

}
