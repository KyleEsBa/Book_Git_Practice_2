package day15_switch;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 1 - 999: ");
        int number = input.nextInt();
        int centenas, decenas, unidades, numberAux;
        String numberWords = "", auxUnits = "";
        centenas = number / 100;
        decenas = (number % 100) / 10;
        unidades = (number % 100) % 10;

        if (number>0 && number<1000) {
            if (centenas > 0) {
                switch (centenas) {
                    case 1:
                        numberWords += "one";
                        break;
                    case 2:
                        numberWords += "two";
                        break;
                    case 3:
                        numberWords += "three";
                        break;
                    case 4:
                        numberWords += "four";
                        break;
                    case 5:
                        numberWords += "five";
                        break;
                    case 6:
                        numberWords += "six";
                        break;
                    case 7:
                        numberWords += "seven";
                        break;
                    case 8:
                        numberWords += "eight";
                        break;
                    case 9:
                        numberWords += "nine";
                        break;
                }
                numberWords += " hundred ";
            }
            if (unidades > 0) {
                switch (unidades) {
                    case 1:
                        auxUnits += "one";
                        break;
                    case 2:
                        auxUnits += "two";
                        break;
                    case 3:
                        auxUnits += "three";
                        break;
                    case 4:
                        auxUnits += "four";
                        break;
                    case 5:
                        auxUnits += "five";
                        break;
                    case 6:
                        auxUnits += "six";
                        break;
                    case 7:
                        auxUnits += "seven";
                        break;
                    case 8:
                        auxUnits += "eight";
                        break;
                    case 9:
                        auxUnits += "nine";
                        break;
                }
            }
            if (decenas > 0) {
                switch (decenas) {
                    case 1:
                        switch (unidades) {
                            case 1:
                                numberWords += "eleven";
                                break;
                            case 2:
                                numberWords += "twelve";
                                break;
                            case 3:
                                numberWords += "thirteen";
                                break;
                            case 0:
                                numberWords += "ten";
                                break;
                            default:
                                numberWords += auxUnits + "teen";
                                break;
                        }
                        break;
                    case 2:
                        numberWords += "twenty ";
                        break;
                    case 3:
                        numberWords += "thirty ";
                        break;
                    case 4:
                        numberWords += "forty ";
                        break;
                    case 5:
                        numberWords += "fifty ";
                        break;
                    case 6:
                        numberWords += "sixty ";
                        break;
                    case 7:
                        numberWords += "seventy ";
                        break;
                    case 8:
                        numberWords += "eighty ";
                        break;
                    case 9:
                        numberWords += "ninety ";
                }
            }
            if (decenas != 1)
                numberWords += auxUnits;
            System.out.println(numberWords);
        }
        else{
            System.out.println("The number is out of range");
        }
    }
}
