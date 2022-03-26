package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        String message;
        System.out.println("Enter a number: ");
        number=input.nextInt();
        if (number%3==0 && number%5==0)
            message="FizzBuzz";
        else if (number%3==0)
            message="Fizz";
        else if (number%5==0)
            message="Buzz";
        else
            message="It is not divisible neither by 3 nor 5";
        System.out.println(message);
    }
}
