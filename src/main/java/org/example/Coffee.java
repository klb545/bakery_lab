package org.example;

import enums.Size;
import interfaces.ISell;

public class Coffee implements ISell {

    private String name;
    private Size size;
    private double cost;
    private double sellPrice;


    public Coffee(String name, Size size, double cost, double sellPrice){
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }




//    INTERFACE
    public double calculateMargin(){
        return (this.sellPrice - this.cost);
    }


//    CUSTOM METHOD
public void increaseSize(){
    if(this.size == Size.SMALL){
        this.size = Size.MEDIUM;
    }
    if(this.size == Size.MEDIUM || this.size == Size.LARGE){
        this.size = Size.LARGE;
    }
}
    public void reduceSize(){
        if(this.size == Size.SMALL || this.size == Size.MEDIUM){
            this.size = Size.SMALL;
        }
        if(this.size == Size.LARGE){
            this.size = Size.MEDIUM;
        }
    }
}
