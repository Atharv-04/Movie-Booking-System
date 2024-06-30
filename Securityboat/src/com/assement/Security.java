package com.assement;

import java.util.Base64;

public class Security
{

    public static String encryptPassword(String password)
    {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    public static boolean validatePassword(String inputPassword, String storedPassword) 
    {
        return encryptPassword(inputPassword).equals(storedPassword);
    }
}
