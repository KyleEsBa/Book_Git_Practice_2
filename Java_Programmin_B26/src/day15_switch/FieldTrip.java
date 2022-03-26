package day15_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = input.nextInt();
        String location="", teacher="";
        int numberOfGroups=0;

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 3) {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 4) {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 5) {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else {
                location = "Apple Orchand";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            }
            System.out.println("This is the information for your "+grade+" group:\n\t-Assigned Location: "+location+"\n\t-Assigned Teacher: "+teacher+"\n\t-Number Assigned: "+numberOfGroups);
        } else {
            System.out.println("Grade must be between 1 and 6");
        }
    }
}
