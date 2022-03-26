package day31_arrays;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str="listen";
        String str2="silent";

        char [] one=str.toCharArray();
        char [] two=str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        System.out.println(Arrays.equals(one,two)?"Words are anagram":"Words are not anagram");
    }
}

