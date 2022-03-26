package day29_arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] numbers={10,0,5,0,1,0};
        int [] ordered=new int[numbers.length];

        for (int i = 0, j=0; i < numbers.length; i++) {
            if (numbers[i]!=0){
                ordered[j]=numbers[i];
                j++;
            }
            else{
                ordered[numbers.length-j]=0;
            }
        }
        System.out.println(Arrays.toString(ordered));
    }
}
