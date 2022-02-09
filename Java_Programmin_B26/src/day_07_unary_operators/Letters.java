package day_07_unary_operators;

public class Letters {
    public static void main(String[] args) {
        char letter='G';
        System.out.println("Original letter: "+letter++);
        System.out.println("Next four letters: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
    }
}
