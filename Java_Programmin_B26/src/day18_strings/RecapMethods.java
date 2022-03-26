package day18_strings;

public class RecapMethods {
    public static void main(String[] args) {
        String s="pen";
        String s2=new String("pen");
        System.out.println("Compare with == "+(s == s2));
        System.out.println("Compare with equals(<variable>) "+(s.equals(s2)));
        System.out.println("Compare with equals(<String>) "+(s.equals("Pen")));
        System.out.println("Compare with equalsIgnoreCase() "+(s.equalsIgnoreCase("Pen")));
    }
}
