package day9_scanner;

import java.util.Scanner;

public class ScannerClassEg1 {
    public static void main(String[] args) {
        //Declare a variable where store your keyboard input
        String name;
        //Declare a variable of class Scanner (sc is the name of the variable, can be whatever)
        Scanner sc =new Scanner(System.in);
        //Asks for your name
        System.out.println("Write your name: ");
        //Read the input of the keyboard (Assign the read input to the variable name)
        name=sc.nextLine();
        //Show the catch input
        System.out.println("Your name is: "+name);
    }
}
