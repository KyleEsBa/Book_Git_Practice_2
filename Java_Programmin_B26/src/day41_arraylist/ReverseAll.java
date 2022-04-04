package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import my_utility.StringUtil;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday"));
        System.out.println(reverseAll(list));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> list){
        ArrayList<String> reverseWords=new ArrayList<>();
        for (String each:list) {
            reverseWords.add(StringUtil.reverseString(each));
        }
        return reverseWords;
    }
}
