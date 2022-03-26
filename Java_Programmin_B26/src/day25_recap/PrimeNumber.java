package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrime=true;
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"Is prime":"Is not prime");
    }
}
