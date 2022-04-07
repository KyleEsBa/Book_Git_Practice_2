package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("coffe");
        drinks.add("tea");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList<String> drinks2=new ArrayList<>(drinks);
        System.out.println(drinks2);

        String[]allDrinks={"coffe","tea","soda"};
        ArrayList<String> drinks3=new ArrayList<>(Arrays.asList(allDrinks));

        ArrayList<String>drinks4=new ArrayList<>(Arrays.asList("coffe", "soda", "tea"));
        System.out.println(drinks4);
    }
}
