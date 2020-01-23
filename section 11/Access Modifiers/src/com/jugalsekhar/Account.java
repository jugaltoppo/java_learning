package com.jugalsekhar;

import java.util.ArrayList;
class Account {
    private String name;
    private int balance=0;
    private ArrayList<Integer> transactions;

    public Account(String name)
    {
        this.name=name;
        this.transactions=new ArrayList<>();
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void deposit(int amount)
    {
        if(amount>0)
        {
            this.balance += amount;
            System.out.println(amount + " amount deposited. Current balance is " + this.balance);
            transactions.add(amount);
        }
        else
        {
            System.out.println("Negative amount cannot be deposited");
        }
    }

    public void withdrawal(int amount)
    {
        int withdrawal = -amount;
        if(withdrawal<0)
        {
            this.balance+=withdrawal;
            System.out.println(amount + " withdrawed. Current balance is " + this.balance);
            transactions.add(withdrawal);
        }
        else
        {
            System.out.println("negative amount cannot be withdrawed");
        }
    }

    public void calculateBalance()
    {
        int bal=0;
        for(int i : transactions)
        {
            bal+=i;
        }
        System.out.println("calculated balance is " +bal);
    }
}
