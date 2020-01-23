package com.example.timchallenge;

public class Series {

    public static int nSum(int n)
    {
        int sum=0;
        for(int j=0;j<=n;j++)
        {
            sum+=j;
        }
        return sum;
    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int product=1;
        for(int j=1;j<=n;j++)
        {
            product*=j;
        }
        return product;
    }
    public static int fibonacci(int n)
    {
        int a=0;
        int b=1;
        int sum=0;
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        for(int i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
