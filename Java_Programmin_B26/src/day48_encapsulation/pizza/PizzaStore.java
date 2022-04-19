package day48_encapsulation.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza tropical=new Pizza("large",3);
        System.out.println(tropical);

        tropical.setNumbersOfToppings(2);
        System.out.println(tropical);

        Pizza hawaiana=new Pizza("" ,-2);
        System.out.println(hawaiana);
        hawaiana.setType("Small");
        hawaiana.setNumbersOfToppings(-3);
        System.out.println(hawaiana);
    }
}
