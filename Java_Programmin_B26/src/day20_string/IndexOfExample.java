package day20_string;

public class IndexOfExample {
    public static void main(String[] args) {
        String s="banana";
        int firstIndex=s.indexOf(s);
        System.out.println("First appear of \'a\' "+firstIndex);
        int lastIndex=s.lastIndexOf(s);
        System.out.println("Last appear of \'a\' "+lastIndex);
        int secondIndex=s.indexOf(s,firstIndex+1);
        System.out.println("Second appear of \'a\' "+secondIndex);
    }
}
