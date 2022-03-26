package day30_arrays;

public class SplitExample {
    public static void main(String[] args) {
        String s="monday,tuesday,wensday,thursday,friday,saturday,sunday";
        String[] days=s.split(",");
        System.out.println(days);
        for(String day:days){
            System.out.println(day);
        }
    }
}
