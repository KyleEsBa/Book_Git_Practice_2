package chapter_1;

import java.util.Arrays;

public class page1 {
    public static void main(String[] args) {
        int[]n1=new int[3];
        int[]n2={1,2,3,4,5,6};

        n1=n2;
        for(int a:n1){
            System.out.println(a);
        }
    }
}
