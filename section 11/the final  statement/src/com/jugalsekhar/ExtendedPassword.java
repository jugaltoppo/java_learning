package com.jugalsekhar;

public class ExtendedPassword extends Password {
    private int decryptedPassword;
    public ExtendedPassword(int password)
    {
        super(password);
        this.decryptedPassword=password;
    }

//    public int storedPassword()
//    {
//        return decryptedPassword;
//
//    }

}
