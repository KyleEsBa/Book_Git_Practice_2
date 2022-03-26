package day29_arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int [] nums={30,12,159,12};
        for(int element:nums){
            System.out.println("For each: "+element);
        }

        String [] classes={"Java", "Soft Skills", "Selenimum", "Database", "api"};
        for(String words:classes){
            System.out.println("The elements are: "+words);
        }

        double [] prices={10.4,40.2,410.2};
        for(double each:prices){
            System.out.println("$"+each);
        }
    }
}
