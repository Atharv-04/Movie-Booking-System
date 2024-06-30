package com.assement;

import java.util.HashMap;
import java.util.Map;

 class UserManager {
    private Map<String, User> User = new HashMap<>();

    public void register(String name, String email, String password) 
    {
        if (User.containsKey(email)) {
            System.out.println("User already exists!");
        } else {
            User.put(email, new User(name, email, password));
            System.out.println("User registered successfully!");
        }
    }

    public boolean login(String email, String password)
    {
        if (User.containsKey(email) && User.get(email).getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password!");
            return false;
        }
    }
}

