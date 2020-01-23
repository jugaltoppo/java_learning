package com.jugalsekhar;

public class SomeClass {
    private String name;
    private static int classCounter=0;
    public final int instancenumber;
    public SomeClass(String name)
    {
        this.name=name;
        classCounter++;
        this.instancenumber=classCounter;
        System.out.println(name + " created, instance is " + instancenumber);
    }

    public String getName()
    {

        return name;
    }
    public int getInstancenumber()
    {
        return instancenumber;
    }

//    public void count()
//    {
//        System.out.println(classCounter);
//    }
}
