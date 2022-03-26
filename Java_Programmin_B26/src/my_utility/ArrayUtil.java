package my_utility;

import java.util.Arrays;

public class ArrayUtil {
    public static int minNumber(int[]nums){
        int min=nums[0];
        for(int num:nums){
            if (num<min)
                min=num;
        }
        return min;
    }

    public static int maxNumber(int[]nums){
        int max=nums[0];
        for(int num:nums){
            if (num>max)
                max=num;
        }
        return max;
    }

    public static int[] minNumberSort(int[]nums){
        Arrays.sort(nums);
        return nums;
    }

    public static boolean contains(int[]nums,int element){
        for (int each:nums){
            if (each==element)
                return true;
        }
        return false;
    }
}
