package day31_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] words={"java","Hello","$Dollar","4four","five5"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
