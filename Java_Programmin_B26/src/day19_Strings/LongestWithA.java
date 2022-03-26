package day19_Strings;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the fist word: ");
        String word1 = (input.next()).toLowerCase(Locale.ROOT);
        System.out.println("Enter the second word: ");
        String word2 = input.next().toLowerCase(Locale.ROOT);
        System.out.println("Enter the third word: ");
        String word3 = input.next().toLowerCase(Locale.ROOT);
        String largest="";

        if (word1.contains("a") && word1.length()>=word2.length() && word1.length()>=word3.length())
            largest=word1;
        if (word2.contains("a") && word2.length()>=word3.length() && word2.length()>=word1.length())
            largest=word2;
        if (word3.contains("a") && word3.length()>=word2.length() && word3.length()>=word1.length())
            largest=word3;
        System.out.println(largest.isEmpty()?"No single largest word with a":"The largest word is "+largest);
    }
}
