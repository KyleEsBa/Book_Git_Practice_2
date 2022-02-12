package day7_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x=0;
        System.out.println(x);

        x=x+1;
        System.out.println(x);

        x++;
        System.out.println(x);

        ++x;
        System.out.println(x);

        /*Diference between x++ and ++x
        * ++x: pre increment
        * x++: post increment*/
        System.out.println(++x);//First add the value after that print it
        System.out.println(x++);//First print the actual value after that increment the value
    }
}
