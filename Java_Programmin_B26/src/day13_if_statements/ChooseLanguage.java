package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please choose a language:\n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
        System.out.println("Enter a number: ");
        int option=input.nextInt();
        String message;
        if (option==1)
            message="Hello, thank for call";
        else if (option==2)
            message="Hola, gracias por llamar";
        else if (option==3)
            message="Merhaba, aradiginiz icin tekesukkurler";
        else if (option==4)
            message="privet, sprazibo za vash zvonok";
        else if (option==5)
            message="merci, pour votre appel";
        else
            message="We will use english by default";
        System.out.println(message);
    }
}
