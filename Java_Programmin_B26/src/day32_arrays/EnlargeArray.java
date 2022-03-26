package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EnlargeArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int times=input.nextInt();
        int number, shortArray[]=new int[times];
        for (int i = 0; i < times; i++) {
            System.out.println("Enter a number: ");
            number=input.nextInt();
            shortArray[i]=number;
        }
        int [] longArray=Arrays.copyOf(shortArray,times+1);
        System.out.println("Enter the last number: ");
        longArray[longArray.length-1]=input.nextInt();
        System.out.println(Arrays.toString(longArray));
    }
}
