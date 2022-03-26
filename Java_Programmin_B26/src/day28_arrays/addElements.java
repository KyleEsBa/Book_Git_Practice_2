package day28_arrays;

import java.util.Scanner;

public class addElements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[3];
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number "+i+": ");
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
