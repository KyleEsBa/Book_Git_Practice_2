package day33_methods;

import java.util.Scanner;

public class InvokeAge {
    public static void main(String[] args) {
        CalculateAge.getFullName("Kyle Escobedo Baca");
        CalculateAge.getAge(1995);
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your birthday year: ");
        CalculateAge.getAge(input.nextInt());
    }
}
