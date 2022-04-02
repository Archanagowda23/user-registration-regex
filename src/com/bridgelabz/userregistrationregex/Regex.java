package com.bridgelabz.userregistrationregex;

public class Regex {

    public static void main(String[] args) {
        System.out.println("Welcome to regex program");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.email();
        userRegistration.contactNumber();
        userRegistration.passwordEightDigit();
        userRegistration.passwordOneUpperCase();

    }
}
