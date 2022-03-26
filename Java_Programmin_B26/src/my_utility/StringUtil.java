package my_utility;

import java.util.Arrays;

public class StringUtil {
    public static String reverseString(String str){
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    /*public static String CapitalizeLetter1(){

    }*/

    public static int freuencyOfCharacter(String str, char letter){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter)
                count++;
        }
        return count;
    }

    public static String uniqueCharacters(String str){
        String unique ="";
        for (int i = 0; i < str.length(); i++) {
            int count=StringUtil.freuencyOfCharacter(str,str.charAt(i));
            if (count==1)
                unique+=str.charAt(i);
        }
        return unique;
    }
}
