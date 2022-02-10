package day8_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard=200;
        System.out.println("Buy item 1 for $100.50");
        giftCard-=100.50;
        System.out.println("Buy item 2 for $40");
        giftCard-=40;
        System.out.println("Your gift card balance is: $"+giftCard);
    }
}
