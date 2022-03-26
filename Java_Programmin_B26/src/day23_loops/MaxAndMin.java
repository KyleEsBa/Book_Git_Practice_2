package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int i=0, max=-2147483647, min=2147483647,number=0;
        Scanner input=new Scanner(System.in);
        while(i<5){
            i++;
            System.out.println("Enter a number: ");
            number= input.nextInt();
            if (max<number)
                max=number;
            if (min>number)
                min=number;
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
