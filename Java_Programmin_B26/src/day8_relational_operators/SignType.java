package day8_relational_operators;

public class SignType {
    public static void main(String[] args) {
        int number=-30;
        boolean isPositive= number>0;
        boolean isNegative= number<0;
        boolean is0= number==0;
        System.out.println("The number is positive? "+isPositive);
        System.out.println("The number is negative? "+isNegative);
        System.out.println("The number is cero? "+is0);
    }
}
