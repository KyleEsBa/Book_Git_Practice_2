package day3CommentsEscapeSequence;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        System.out.println("I like \"Java\" Programing");
        System.out.print("Do yo like it: ");
        Scanner leer = new Scanner(System.in);
        if (leer.nextLine().equals("Yes")) {
            System.out.println("Great!");
        } else {
            System.out.println("That's \\  terrible");
        }
    }
}
