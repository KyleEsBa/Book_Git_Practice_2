package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        //it is executed first after that condition is evaluated
        int a=0;
        do{
            System.out.println(a);
            a++;
        }while(a==10);

        //it evaluates the condition after that the statement is executed
        int b=0;
        while(b==10){
            System.out.println(b);
            b++;
        }
    }
}
