package day48_encapsulation.square_ships;

public class BasicShips {
    public static void main(String[] args) {
        Square sq1=new Square(5);
        System.out.println(sq1);
        sq1.getSide();
        //sq1.side=10; can not be changed, because private access
        System.out.println();
        sq1.setSide(11);
        System.out.println(sq1);
        System.out.println(sq1.getSide());
    }
}
