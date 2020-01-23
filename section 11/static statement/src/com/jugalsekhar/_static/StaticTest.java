package com.jugalsekhar._static;

public class StaticTest {
    private String name;
    private static int numInstance=0;
    private int num=0;
    public StaticTest(String name)
    {
        this.name=name;
        numInstance++;
        this.num=numInstance;
    }

    public String getname()
    {
        return name;
    }
    public int getNumInstance()
    {
        return numInstance;
    }
    public int getNum()
    {
        return this.num;
    }
}
