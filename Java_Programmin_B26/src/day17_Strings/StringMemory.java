package day17_Strings;

public class StringMemory {
    public static void main(String[] args) {
        String first="java";

        String second=new String("java");
        //== doesn't compar characters, it compares memory locations
        System.out.println(first==second);

        String third="java";
        System.out.println(first==third);
    }
}
