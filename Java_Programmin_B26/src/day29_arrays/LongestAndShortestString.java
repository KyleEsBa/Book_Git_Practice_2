package day29_arrays;

public class LongestAndShortestString {
    public static void main(String[] args) {
        String [] str={"apple","java","computer","water"};
        String shortest=str[0], longest=str[0];
        for (String element:str){
            if (element.length()>=longest.length())
                longest=element;
            if (element.length()<=shortest.length())
                shortest=element;
        }
        System.out.println("Shortest word: "+shortest);
        System.out.println("Longest word: "+longest);
    }
}
