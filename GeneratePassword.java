package service;

import java.util.Random;

public class GeneratePassword {
    public String generatePassword(){
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";

      Random random = new Random();
      
      char [] password = new char [8];
      for(int i=0; i<8; i++){
          password[i] = capitalCaseLetters.charAt(random.nextInt(25));
      }
      //String password = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())) + lowerCaseLetters.charAt(random.nextInt(25)) + specialCharacters.charAt(random.nextInt(25)) +  (numbers.charAt(random.nextInt(25)) ) + capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())) + lowerCaseLetters.charAt(random.nextInt(25)) + specialCharacters.charAt(random.nextInt(25)) +  (numbers.charAt(random.nextInt(25))); // + (numbers.charAt(random.nextInt(25))) ;
      return password.toString();
    }

}

