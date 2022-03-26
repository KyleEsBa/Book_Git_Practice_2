package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        double price=50.34;
        boolean hasPrime=true;
        if (hasPrime){
            System.out.println("Elegible for 2 day shipping");
        }else{
            if (price>=25){
                System.out.println("Elegible for regular for regular free shipping");
            } else {
                System.out.println("Not elegible for a free shipping. Shipping fee: 3.99");
                price+=3.9;
            }
        }
    }
}
