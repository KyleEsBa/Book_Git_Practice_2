package day48_encapsulation.pizza;

public class Pizza {
    private String type;
    private int numbersOfToppings;

    public Pizza(String type, int numbersOfToppings){
        setType(type);
        setNumbersOfToppings(numbersOfToppings);
    }

    public String getType(){
        return type;
    }

    public int getNumbersOfToppings(){
        return numbersOfToppings;
    }

    public void setType(String type){
        switch (type.toLowerCase()){
            case "small":
            case "medium":
            case "large":
                this.type=type;
        }
    }

    public void setNumbersOfToppings(int numbersOfToppings){
        if (numbersOfToppings>=0)
            this.numbersOfToppings=numbersOfToppings;
    }

    public double calculatePrice(){
        if (type==null)
            return -1;

        double totalPrice=0;
        switch (type){
            case "small":
                totalPrice+=4;
                break;
            case "medium":
                totalPrice+=6;
                break;
            case "large":
                totalPrice+=8;
                break;
        }
        totalPrice+=numbersOfToppings*0.75;
        return totalPrice;
    }

    public String toString(){
        return "The pizza is of "+type+" size and has "+numbersOfToppings+" toppings, the cost is $"+calculatePrice();
    }
}
