package day13_if_statements;

public class Diver {
    public static void main(String[] args) {
        int oxigen=50;
        if (oxigen>90)
            System.out.println("Your tank is full");
        else if (oxigen>80)
            System.out.println("Still okay");
        else if (oxigen>70)
            System.out.println("Don't go to far");
        else if (oxigen>60)
            System.out.println("Start to head back");
        else if (oxigen>50)
            System.out.println("Be careful now you are at 50%");
        else
            System.out.println("Dangerous");
    }
}
