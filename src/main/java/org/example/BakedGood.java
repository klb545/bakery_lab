package org.example;

public abstract class BakedGood implements interfaces.ISell {

    private String name;
    private String baseFlavour;
    private double cost;
    private double sellPrice;


    public BakedGood(String name, String baseFlavour, double cost, double sellPrice){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.cost = cost;
        this.sellPrice = sellPrice;
    }

//    GETTERS & SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }

    public void setBaseFlavour(String newBaseFlavour) {
        this.baseFlavour = newBaseFlavour;
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



//    CUSTOM METHODS
//    INTERFACE
    public double calculateMargin(){
        return (this.sellPrice - this.cost);
    }

    //    ABSTRACT METHOD
    public abstract void increaseSize();
    public abstract void reduceSize();

}
