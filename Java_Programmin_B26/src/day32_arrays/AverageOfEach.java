package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfEach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ");
        int [][] wholeArray=new int[3][];

        int [] innerA1=new int[]{3,4,5,6};
        int [] innerA2=new int[]{5,2,6};
        int [] innerA3=new int[]{10,20,30};

        wholeArray[0]=innerA1;
        wholeArray[1]=innerA2;
        wholeArray[2]=innerA3;

        System.out.println(Arrays.deepToString(wholeArray));

        //With the for each loop
        double wholeSum=0;
        int totalLength=0;
        for(int [] arrays:wholeArray){
            double innerSum=0;
            for (int elements:arrays){
                innerSum+=elements;
            }
            wholeSum+=innerSum;
            totalLength+=arrays.length;
            System.out.println(Arrays.toString(arrays)+" the average is: "+(innerSum/arrays.length));
        }
        System.out.println("Whole the array:\n"+Arrays.deepToString(wholeArray)+"\nThe average of the whole arrays is: "+(wholeSum/totalLength));

        //With the for loop
        double totalColumnsSum=0,totalArrayLength=0;
        for (int i = 0; i < wholeArray.length; i++) {
        double rowSum=0;
            for (int j = 0; j < wholeArray[i].length; j++) {
                rowSum+=wholeArray[i][j];
            }
            totalColumnsSum+=rowSum;
            totalArrayLength+=wholeArray[i].length;
            System.out.println("The row average of "+Arrays.toString(wholeArray[i])+"is: "+(rowSum/wholeArray[i].length));
        }
        System.out.println("The total arrays is:\n"+Arrays.deepToString(wholeArray)+"\n the total average is: "+(totalColumnsSum/totalArrayLength));
    }
}
