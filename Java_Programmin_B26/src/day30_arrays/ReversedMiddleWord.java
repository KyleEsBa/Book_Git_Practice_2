package day30_arrays;

public class ReversedMiddleWord {
    public static void main(String[] args) {
        String str="Today is monday";
        String [] words=str.split(" ");

        char[]letters=words[1].toCharArray();
        String reversedWord="";
        for (int i=letters.length-1;i>=0;i--){
            reversedWord+=letters[i];
        }
        System.out.println(words[0]+" "+reversedWord+" "+words[2]);
    }
}
