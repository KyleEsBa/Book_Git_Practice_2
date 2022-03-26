package day34_methods;

public class CreditScore {
    public static int getScore(){
        return 800;
    }

    public static boolean isGoodCreditScore(int creditScore){
        if (creditScore>=700)
            return true;
        return false;
    }
}
