package com.jugalsekhar._static;

public class Main {
    public static void main(String[] args)
    {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getname() + " " + firstInstance.getNumInstance());



        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getname() + " " +secondInstance.getNumInstance());


        StaticTest thirdinstance = new StaticTest("3rd instance");
        System.out.println(thirdinstance.getname() + " " +thirdinstance.getNumInstance());

        System.out.println(secondInstance.getname() + " " +secondInstance.getNum());
    }

}
