package day11_if_statements;

public class BankAccount {
    public static void main(String[] args) {
        double balance=100;
        double withdraw=50;

        //withdraw some amount of money  form my balance
        balance -=withdraw;
        if (balance<0){
            System.out.println("Took out too much money, $100 overdraft applied");
            balance-=100;
        }
    }
}
