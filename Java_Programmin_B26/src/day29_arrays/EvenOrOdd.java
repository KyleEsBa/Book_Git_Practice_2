package day29_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int [] numbers={4,1,3,12,5};
        int even=0, odd=0;
        String evenNumbers="", oddNumbers="";
        for (int element:numbers){
            if (element%2==0) {
                even++;
                evenNumbers+=element+" ";
            }
            else{
                odd++;
                oddNumbers+=element+" ";
            }
        }
        System.out.println("Nro even numbers: "+even);
        System.out.println("Even numbers: "+evenNumbers);

        System.out.println("Nro odd numbers: "+odd);
        System.out.println("Odd numbers: "+oddNumbers);
    }
}
