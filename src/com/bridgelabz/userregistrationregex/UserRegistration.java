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
        Boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
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
        Boolean answer = Pattern.matches("^[a-zA-Z0-9+_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
        if (answer) {
            System.out.println("thank you");
        } else {
            System.out.println("please enter valid email ID ");
        }

    }
}