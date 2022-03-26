package day33_methods;

import java.util.Arrays;

public class OurArrayClass {
    public static void firstElement(int[]nums){
        System.out.println("First element: "+nums[0]);
    }

    public static void lastElement(int[]nums){
        System.out.println("Last element: "+nums[nums.length-1]);
    }

    public static void allElements(int[]nums){
        System.out.println("All the elements: "+Arrays.toString(nums));
    }

    public static void middleElements(int[]nums){
        if (nums.length%2==0)
            System.out.println("Middle Elements: "+nums[nums.length/2]+", "+nums[(nums.length/2)+1]);
        else
            System.out.println("Middle Element: "+nums[nums.length/2]);
    }
}
