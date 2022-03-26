package day33_methods;

public class ArrayElements {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,4};
        OurArrayClass.firstElement(numbers);
        OurArrayClass.lastElement(numbers);
        OurArrayClass.middleElements(numbers);
        OurArrayClass.allElements(numbers);
    }
}
