package day36_methods;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("Default empty method");
    }

    public static int method(int a){
        return 0;
    }

    public static void main(String[] args) {
        method();
        System.out.println(method(0));
    }
}
