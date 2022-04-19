package day48_encapsulation.square_ships;

public class Square {
    private int side;

    public Square(int side){
        setSide(side);
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        if (side>0)
            this.side=side;
        else
            System.out.println("Invalid number");
    }

    public int calculateArea(){
        return side*side;
    }

    public int calculateParameter(){
        return side*4;
    }

    public String toString(){
        return "The side of square: "+side+"\nThe area is: "+calculateArea()+"\nThe parameter is: "+calculateParameter();
    }
}
