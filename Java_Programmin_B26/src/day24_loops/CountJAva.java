package day24_loops;

public class CountJAva {
    public static void main(String[] args) {
        String str = "java ia a java language.java";
        int count=0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).equals("java"))
                count++;
        }
        System.out.println(count);

        int count2=0;
        while(str.contains("java")){
            str=str.replaceFirst("java","");
            count2++;
        }
        System.out.println(count2);
    }
}
