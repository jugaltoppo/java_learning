package com.jugalsekhar;

public class Main {

    public static void main(String[] args) {
        String var4="This is private to main";
	ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        ScopeCheck.InnerClass innerclass = scopeInstance.new InnerClass();
//        System.out.println(innerclass.var3);  // wont work cuz var3 is private
	System.out.println("ScopeInstance var1 is " + scopeInstance.getVar1());
	System.out.println(var4);
        System.out.println("**********************");


        scopeInstance.timesTwo();
        System.out.println("**********************");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
