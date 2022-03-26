package day29_arrays;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String [] items={"Shoes", "Jacket", "Gloves"};
        double  [] prices={89.9,150.0,99.3};
        int [] itemsId={12345,12346,12347};
        System.out.println("-----------CATALOG----------");
        for (int i=0;i<=items.length-1;i++)
            System.out.println("Item: "+items[i]+"\tPrice: "+prices[i]+"\tID: "+itemsId[i]);
        System.out.println("-----------CATALOG----------");
        int searchedIndex=-1;
        System.out.println("-----------SEARCHED ITEM----------");
        for (int j=0;j<=items.length-1;j++) {
            if (items[j].equalsIgnoreCase("gloves")) {
                searchedIndex = j;
                System.out.println("Item: "+items[j]+"\tPrice: "+prices[j]+"\tID: "+itemsId[j]);
                break;
            }
        }
        System.out.println("Index of gloves: "+searchedIndex);
        System.out.println("-----------SEARCHED ITEM----------");
        System.out.println("-----------MAX PRICE ITEM----------");
        double maxPrice=prices[0];
        int indexMaxPrice=0;
        for (int k=0;k<prices.length;k++){
            if (prices[k]>=maxPrice) {
                maxPrice = prices[k];
                indexMaxPrice=k;
            }
        }
        System.out.println("Item: "+items[indexMaxPrice]+"\tPrice: "+prices[indexMaxPrice]+"\tID: "+itemsId[indexMaxPrice]);
        System.out.println("-----------MAX PRICE ITEM----------");
    }
}
