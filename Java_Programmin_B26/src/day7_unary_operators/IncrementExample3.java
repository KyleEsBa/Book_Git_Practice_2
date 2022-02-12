package day7_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i=5;//i -> 5
        int z=i++;//z -> 5
        System.out.println(i);//i -> 6
        System.out.println(z);//z -> 5

        int a=10;// a -> 10
        int b=a+1;//b -> 11
        System.out.println(a);//a -> 10
        System.out.println(b);//b -> 11

        int c=++a;// c -> 11
        System.out.println(c);
    }
}
