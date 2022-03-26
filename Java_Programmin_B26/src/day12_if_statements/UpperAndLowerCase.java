package day12_if_statements;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        char letter='a';
        /*if (letter>=97 && letter<=122){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }*/

        if (letter>='A' && letter<='Z'){
            System.out.println("Upper case");
        }
        else{
            System.out.println("Lower case");
        }
    }
}
