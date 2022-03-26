package day34_methods;

public class Scoring {
    public static void main(String[] args) {
        System.out.println(CreditScore.getScore());
        System.out.println(CreditScore.getScore()+50);
        System.out.println(CreditScore.isGoodCreditScore(800));
    }
}
