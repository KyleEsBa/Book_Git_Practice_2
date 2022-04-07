package day38_ArrayList;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.isEmpty());
        nums.add(200);
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);
        nums.add(300);
        System.out.println(nums.contains(300));
    }
}
