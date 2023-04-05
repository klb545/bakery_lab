//NEED TO DO THIS PROPERLY AND BAKERY TEST
package org.example;

import interfaces.ISell;
import org.example.BakedGood;

import java.util.ArrayList;

public class Bakery {
    private String name;
    private ArrayList<ISell> stock;
    private double till;
    public Bakery(String name, ArrayList<ISell> stock, double till){
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

//    GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }



    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }



// CUSTOM METHODS
    public double calculateProfit(){
        int totalProfit = 0;
        for(ISell foodOrDrinkItem : stock){
            totalProfit += foodOrDrinkItem.calculateMargin();
        }
        return totalProfit;
    }

//    //    TODO: test addTieredCakeToStock
//    public void addItemToStock(ISell item){
//        stock.add(item);
//        item.setStockCountOfItem(item.getStockCountOfItem() + 1);
//    }
//
//    //    OVERLOAD
//    public void addTieredCakeToStock(TieredCake tieredCake, int numberOfTieredCakeItem){
//        if(!stock.contains(tieredCake)){
//            stock.add(tieredCake);
//        }
//        tieredCake.setStockCountOfItem(tieredCake.getStockCountOfItem() + numberOfTieredCakeItem);
//    }


}
