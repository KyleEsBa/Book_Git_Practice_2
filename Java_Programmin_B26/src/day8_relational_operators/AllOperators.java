package day8_relational_operators;

public class AllOperators {
    public static void main(String[] args) {
        System.out.println(5 + 2 * 3);
        //Priority 1:   (2 * 3)
        //Priority 2:   5 + (6)
        //Result:       11

        System.out.println(5 * 2 + 4 / 2);
        //Priority 1:   (5 * 2) and (4 / 2)
        //Priority 2:   (10 + 2)
        //Result:       12

        System.out.println(5 + 2 > 4 - 3);
        //Priority 1:   (5 + 2) and (4 - 3)
        //Priority 2:   (7 > 1)
        //Result:       true


        int a = 20;//20
        int b= -a--     +   a++     +   --a     *     a--;
        //     -20      +   19      +   19      *     19
        //     -20      +   19      +   361
        //     -1       +   361
        //     360
        System.out.println(b);
    }
}
