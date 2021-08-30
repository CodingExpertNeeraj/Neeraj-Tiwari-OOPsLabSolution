package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;


public class DriverClass {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Neeraj", "Tiwari");
        CredentialsService myCred = new CredentialsService();

        System.out.println("Please enter the department from the following: \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
        Scanner myChoice = new Scanner(System.in);
        
        switch (myChoice.nextInt()) {
            // Technical Department
            case 1:
                myCred.showCredentials(myEmployee.getFirstName(), myCred.generateEmailAddress(myEmployee.getFirstName(),
                        myEmployee.getLastName(), "tec"), myCred.generatePassword());
                break;

                // Admin Department
            case 2:
                myCred.showCredentials(myEmployee.getFirstName(),
                        myCred.generateEmailAddress(myEmployee.getFirstName(), myEmployee.getLastName(), "adm"),
                        myCred.generatePassword());
                break;

                // Human Department 
                case 3:
                    myCred.showCredentials(myEmployee.getFirstName(),
                            myCred.generateEmailAddress(myEmployee.getFirstName(), myEmployee.getLastName(), "hr"),
                            myCred.generatePassword());
                    break;
                // Legal Department    
                case 4:
                    myCred.showCredentials(myEmployee.getFirstName(),
                            myCred.generateEmailAddress(myEmployee.getFirstName(), myEmployee.getLastName(), "leg"),
                            myCred.generatePassword());
                    break;
                default:  break;
        }
    }
}


