package com.bridgelabz.userregistrationregex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * purpose : Usage of Java Regular Expressions and Patterns to solve User Registration Problem.
 * @author : Archana
 * @since : 01-04-2022
 */
public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);

    /**
     * added first method to check match the first name
     * // (?=.*[a-z]) # a lower case letter must occur at least once
     * // (?=.*[A-Z]) # an upper case letter must occur at least once
     * //(?=.*[0-9]) represents a digit must occur at least once.
     * // (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
     * // $ represents the end of the string.
     */
    public void firstName() {
        System.out.print("Enter First Name :: ");
        String firstName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid first name ");
        }

    }

    /**
     * added last method to check match the last name
     */
    public void lastName() {
        scanner = new Scanner(System.in);
        System.out.print("Enter Last Name :: ");
        String lastName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid last name ");
        }
    }

    /**
     * User's Email Address
     */

    public void email() {
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID :: ");
        String email = scanner.next();
        boolean answer = Pattern.matches("^[a-zA-Z0-9+_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid email ID ");
        }

    }
    //User's Contact Number
    public void contactNumber(){
        scanner = new Scanner(System.in);
        System.out.print("Enter contact number with country code :: " );
        String ContactNumber = scanner.nextLine();
        boolean answer = Pattern.matches("91?[0-9]{10}",ContactNumber);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid contact number");
        }

    }
    // rule1 = minimum 8 characters
    public void passwordEightDigit(){
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: " );
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[a-zA-Z]{8,}",password);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
    // rule1 = minimum 8 characters & atleast 1 upper case
    public void passwordOneUpperCase(){
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: " );
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Z]+[a-z]{7,}",password);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
    // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
    public void passwordOneNum(){
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: " );
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Za-z0-9]{8,}",password);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
    // rule = minimum 8 characters & at least 1 upper case at least one numeric & only 1 special character
    public void passwordOneSpecialCharacter(){
        scanner = new Scanner(System.in);
        System.out.print("Enter password  :: " );
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Za-z0-9]{8,}+[!@#$%^&*+-|'~`,<>.?_]{1}",password);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
    // Validate the given email IDs in sheet
    public void emailValidation(){
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID :: " );
        String Email = scanner.next();
        boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+",Email);
        if (answer){
            System.out.println("Thank you");
        }else {
            System.out.println("enter valid password");
        }
    }
}

