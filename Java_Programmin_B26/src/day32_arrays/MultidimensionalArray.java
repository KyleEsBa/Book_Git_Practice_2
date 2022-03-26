package day32_arrays;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        String [][] cydeo =new String[4][];
        System.out.println(Arrays.deepToString(cydeo));
        String [] GroupOne={"Emre","Yasir","Eda"};
        cydeo[0]=GroupOne;
        System.out.println(Arrays.deepToString(cydeo));
        String [] GroupTwo={"Basri","Demet","Shina","Ismayil"};
        cydeo[1]=GroupTwo;
        System.out.println(Arrays.deepToString(cydeo));
        cydeo[2]=new String[]{"Mustafa","Lima"};
        System.out.println(Arrays.deepToString(cydeo));
        cydeo[3]=cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        for(String [] innerArray:cydeo){
            for (String eachWord:innerArray){
                System.out.println(eachWord);
            }
        }
    }
}
