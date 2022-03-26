package day29_arrays;


public class AverageNumber {
    public static void main(String[] args) {
        int [] nums={10,15,5,6};
        int sum=0;
        for(int element:nums){
            sum+=element;
        }
        System.out.println("Average: "+sum/nums.length);
    }
}
