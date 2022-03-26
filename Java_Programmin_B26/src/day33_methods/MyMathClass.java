package day33_methods;

public class MyMathClass {
    public static void main(String[] args) {
        add(10,25);
        subtract(10,25);
        multiply(10,25);
        division(10,25);
    }

    public static void add(double num1, double num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }

    public static void multiply(double num1, double num2){
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
    }

    public static void subtract(double num1, double num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }

    public static void division(double num1, double num2){
        if (num2!=0)
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        else
            System.err.println("Cannot divide by 0");
    }
}
