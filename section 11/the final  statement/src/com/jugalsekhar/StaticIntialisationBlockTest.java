package com.jugalsekhar;

public class StaticIntialisationBlockTest {
    public static final String owner;


    static
    {
        System.out.println("2nd initialisation block called");
    }
    static
    {
        owner="Jugal";
        System.out.println("First Initialisation block called");
    }

    public StaticIntialisationBlockTest()
    {
        System.out.println("constructor called");
    }



    public void someMethod()
    {
        System.out.println("Some method called");
    }
}
