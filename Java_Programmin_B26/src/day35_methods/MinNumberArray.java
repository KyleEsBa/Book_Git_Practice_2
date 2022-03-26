package day35_methods;

import java.util.Arrays;
import my_utility.ArrayUtil;

public class MinNumberArray {
    public static void main(String[] args) {
        int[]a={3,5,6,3,21,7,34,98,43,2};
        System.out.println(ArrayUtil.minNumber(a));
        System.out.println(ArrayUtil.maxNumber(a));
        System.out.println(Arrays.toString(ArrayUtil.minNumberSort(a)));
        System.out.println(ArrayUtil.contains(a,5));
    }

}
