package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;


public class StudentInformation {
    public static void main(String[] args) {

        String [] cities={"Chicago", "Boston", "New York"};
        System.out.println(Arrays.toString(cities));
        System.out.println(cities.length);

        Scanner input=new Scanner(System.in);
        String [] student=new String[4];
        String [] questions={"What is your ID?: ","What is your name?: ", "What is your las name?: ", "What is your batch number?: "};
        for (int i = 0; i < student.length; i++) {
            System.out.println(questions[i]);
            student[i]=input.nextLine();
        }
    }
}
