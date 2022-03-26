package day30_arrays;

public class ReverseSentence{
    public static void main(String[] args) {
        String str="Today is monday";
        String [] words=str.split(" ");
        for (int i=words.length-1;i>=0 ;i--)
            System.out.println(words[i]);
    }
}
