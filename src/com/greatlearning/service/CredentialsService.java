package com.greatlearning.service;

import java.util.Random;

public class CredentialsService {

    public char[] generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", smallLetters = "abcdefghijklmnopqrstuvwxyz",
                numbers = "0123456789", specialCharacters = "!@#$%^&*_=+-/.?<>)",
                finalString = capitalLetters + smallLetters + numbers + specialCharacters;
        char[] password = new char[8];

        for (int i = 0; i < 8; i++) {
            password[i] = finalString.charAt(Integer.valueOf(new Random().nextInt(finalString.length() - 1)));
        }
        return password;
    }
    
    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName + lastName + "@" + department + ".abc.com";
    }

    public void showCredentials(String firstName, String eMailID, char[] password)
    {
        System.out.println("Dear "+firstName+" your generated credentials are as follows: \n Email --> "+eMailID+"\n Password --> "+String.valueOf(password));
    }
}

