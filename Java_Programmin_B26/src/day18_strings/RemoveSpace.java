package day18_strings;

public class RemoveSpace {
    public static void main(String[] args) {
        String s="      Saturday        ";
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s.length());

        String a="Java is great";
        System.out.println(a.startsWith("J"));
        System.out.println(a.startsWith("Java"));
        System.out.println(a.endsWith("eat"));
        System.out.println(a.endsWith("EAT"));
    }
}
