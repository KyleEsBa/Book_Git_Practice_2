package day33_methods;

public class GetCharacter {

    public static void lettersAToZ(){
        char letter='A';
        while(letter<='Z') {
            System.out.print(""+letter);
            letter++;
        }
        System.out.println();
    }
    public static void lettersaToz(){
        char letter='a';
        while(letter<='z') {
            System.out.print(""+letter);
            letter++;
        }
        System.out.println();
    }

    public static void lettersZToA(){
        char letter='Z';
        while(letter>='A') {
            System.out.print(""+letter);
            letter--;
        }
        System.out.println();
    }

    public static void letterszToa(){
        char letter='z';
        while(letter>='a') {
            System.out.print(""+letter);
            letter--;
        }
        System.out.println();
    }

    public static void numbers0To9(){
        char number='0';
        while(number<='9'){
            System.out.print(number);
            number++;
        }
        System.out.println();
    }
}
