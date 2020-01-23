package com.jugalsekhar;

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args)
    {
//        SomeClass some=  new SomeClass("1st calss");
//
//        System.out.println(some.getInstancenumber());
//
//        SomeClass some1=  new SomeClass("2nd calss");
//        System.out.println(some1.getInstancenumber());
//
//        System.out.println("********************");

//        some.count();
//        some1.count();

//        Password pass = new ExtendedPassword(545155);
//        System.out.println(pass.storedPassword());
//        pass.letMeIn(54564656);
//        pass.letMeIn(545155);


        StaticIntialisationBlockTest SIBTest = new StaticIntialisationBlockTest();
        SIBTest.someMethod();
        System.out.println("owner name is " + StaticIntialisationBlockTest.owner);
    }
}
