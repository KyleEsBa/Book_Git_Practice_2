package day36_methods;

public class AddElement {
    public static void main(String[] args) {
        int[]a={1,2,3};
        System.out.println(addElement(a,3));
    }
    public static int[] addElement(int[]original,int elementToAdd){
        int[]newArraay=new int[original.length+1];
        for (int i = 0; i < original.length; i++) {
            newArraay[i]=original[i];
        }
        newArraay[newArraay.length-1]=elementToAdd;
        return newArraay;
    }
}
