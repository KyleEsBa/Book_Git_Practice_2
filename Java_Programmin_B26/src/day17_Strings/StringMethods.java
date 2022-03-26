package day17_Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name ="james";
        //Compare Strings -> .equals()
        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));

        String a=new String("hello");
        String b=new String("hello");
        System.out.println(a.equals(b));

        //Compare Strings careless of case sensitive -> .equalsIgnoreCase()
        String otherName="Mickey";
        System.out.println(otherName.equalsIgnoreCase("mickey"));

        //Number of characters -> .length()
        String last="today is fun";
        System.out.println(last.length());
    }
}
