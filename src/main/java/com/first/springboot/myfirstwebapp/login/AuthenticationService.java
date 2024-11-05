package com.first.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public static boolean authenticate(String username, String password){
        boolean isvalidusename = username.equalsIgnoreCase("piyush");
        boolean isvalidpassword = password.equalsIgnoreCase("12345");
        return isvalidusename && isvalidpassword;
    }
}
