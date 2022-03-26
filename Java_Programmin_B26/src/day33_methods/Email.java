package day33_methods;

public class Email {
    public static void buildEmail(String name, String domain){
        String email=name.substring(0,1);
        email+=name.substring(name.indexOf(" ")+1,name.indexOf(" ")+4);
        email+="@"+domain+".com";
        System.out.println(email);
    }
}
