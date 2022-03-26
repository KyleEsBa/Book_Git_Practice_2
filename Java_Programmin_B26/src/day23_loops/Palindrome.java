package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= input.nextLine();
        String reversed="";
        for (int i=word.length()-1;i>=0;i--)
            reversed+=word.charAt(i);
        System.out.println("The word is palindrome: "+(word.equals(reversed)));
    }
}
