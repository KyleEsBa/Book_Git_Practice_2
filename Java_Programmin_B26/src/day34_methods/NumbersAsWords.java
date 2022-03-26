package day34_methods;

public class NumbersAsWords {
    public static String numberToWord(int num){
        String [] words={"One","Two","Three","Four","Five","Six","Seven","Eigth","Nine","Ten"};
        return words[num-1];
    }
}
