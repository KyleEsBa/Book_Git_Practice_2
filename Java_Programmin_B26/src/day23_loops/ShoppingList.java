package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list="Shopping list:";
        String addMore;
        do {
            System.out.println("Please enter your item: ");
            list+="\n*"+input.nextLine();
            System.out.println("Do you want to add more to your shopping list? ");
            addMore= input.nextLine();
        } while(addMore.equalsIgnoreCase("yes"));
        System.out.println(list);
    }
}
