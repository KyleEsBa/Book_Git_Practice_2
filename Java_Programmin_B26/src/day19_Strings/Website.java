package day19_Strings;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the URL: ");
        String url= input.next();
        System.out.println(url.substring(4,url.length()-4));
    }
}
