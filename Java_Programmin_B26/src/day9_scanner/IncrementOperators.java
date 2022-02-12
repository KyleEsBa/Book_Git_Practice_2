package day9_scanner;

public class IncrementOperators {
    public static void main(String[] args) {
        int e=1;
        int f= -e-- + e++ / -e-- * --e;
        System.out.println(e);
        System.out.println(f);
    }
}
