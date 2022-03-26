package day19_Strings;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=(input.nextLine()).toLowerCase(Locale.ROOT);

        if (name.startsWith("mr")||name.startsWith("mister"))
            System.out.println("Hello Sir");
        else if (name.startsWith("ms")||name.startsWith("miss")||name.startsWith("madam"))
            System.out.println("Hello Ma´am");
        else if (name.startsWith("dr"))
            System.out.println("Hello Dr");

        if (name.endsWith("sr"))
            System.out.println("Nice to meet you Senior");
        else if (name.endsWith("jr"))
            System.out.println("Nice to meet you Junior");
    }
}
