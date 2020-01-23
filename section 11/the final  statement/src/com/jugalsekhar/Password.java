package com.jugalsekhar;

public class Password {
    private static final int key=748576362;
    private final int encryptedpassword;
    public Password(int password)
    {
        this.encryptedpassword=encryptDecrypt(password);
    }

    private int encryptDecrypt(int pass)
    {
        return pass^key;
    }

    public final int storedPassword()
    {
        return this.encryptedpassword;
    }

    public boolean letMeIn(int password)
    {
        if(encryptDecrypt(password)==this.encryptedpassword)
        {
            System.out.println("welcome");
            return true;
        }
        else
        {
            System.out.println("not allowed");
        }
        return false;
    }

}
