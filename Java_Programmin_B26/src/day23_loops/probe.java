package day23_loops;

import java.util.Locale;
import java.util.Scanner;

public class probe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        word=word.toLowerCase(Locale.ROOT);
        String newWord="";
        if((word.startsWith("x") || word.endsWith("x")))
            System.out.println(newWord);
    }
}
