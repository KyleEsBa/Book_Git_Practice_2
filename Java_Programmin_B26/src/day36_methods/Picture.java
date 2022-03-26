package day36_methods;

public class Picture {
    public static void draw(){
        System.out.println("Trying to draw");
    }

    public static void draw(String color){
        System.out.println("Draw with "+color);
    }

    public static void draw(String color, String color2){
        System.out.println("Drawung with "+color+" "+color2);
    }

    public static void draw(int size){
        System.out.println("Drawing with size "+size);
    }
}
