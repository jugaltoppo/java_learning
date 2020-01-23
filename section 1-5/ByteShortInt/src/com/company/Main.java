package com.company;

public class Main {

    public static void main(String[] args) {
	    byte mybyte=10;
	    short myshort=20;
	    int myint=50 ;
	    long mylong=50000L+10L*(mybyte+ myshort+myint);
	    short shorttotal=(short)(1000+10*(mybyte+myshort+myint));//typecasting to short
	    System.out.println("long value"+ mylong);
	    System.out.println("short value" + shorttotal);
    }
}
