package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName=input.nextLine();
        firstName=firstName.trim().toLowerCase(Locale.ROOT);
        lastName=lastName.trim().toLowerCase(Locale.ROOT);
        System.out.println(firstName.toUpperCase().charAt(0)+firstName.substring(1)+" "+lastName.toUpperCase().charAt(0)+lastName.substring(1));
    }
}
