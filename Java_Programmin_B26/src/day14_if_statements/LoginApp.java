package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        int expectedPIN=input.nextInt();
        System.out.println("Enter your SSN: ");
        int expectedSSN=input.nextInt();
        if (expectedPIN==1552 && expectedSSN==1234){
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Authentication Failed");
            if (expectedPIN!=1552){
                System.out.println("Incorrect PIN");
            } else {
                System.out.println("Incorrect SSN");
            }
        }
    }
}
