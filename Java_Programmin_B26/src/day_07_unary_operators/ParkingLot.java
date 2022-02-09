package day_07_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {
        int cars=0;

        //aproach 1
        cars=cars+2;
        System.out.println(cars);
        System.out.println("2 more cars drive in");

        //aproach 2
        cars++;
        cars++;
        System.out.println(cars);
        System.out.println("2 more cars drive in");
    }
}
