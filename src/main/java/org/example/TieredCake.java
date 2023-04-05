package org.example;

public class TieredCake extends Sponge {
    private String shape;
    private String secondaryIcingColour;
    private String[] toppings;
    private int tiers;
    private String happyBirthdayMessage;


    public TieredCake(String name, String baseFlavour, double cost, double sellPrice, String icingColour, String shape, String secondaryIcingColour, String[] toppings, int tiers){
        super(name, baseFlavour, cost, sellPrice, icingColour);
        this.shape = shape;
        this.secondaryIcingColour = secondaryIcingColour;
        this.toppings = toppings;
        this.tiers = tiers;
        this.happyBirthdayMessage = "";
    }

//    GETTERS & SETTERS


    public String getShape() {
        return this.shape;
    }

    public void setShape(String newShape) {
        this.shape = newShape;
    }

    public String getSecondaryIcingColour() {
        return this.secondaryIcingColour;
    }

    public void setSecondaryIcingColour(String newSecondaryIcingColour) {
        this.secondaryIcingColour = newSecondaryIcingColour;
    }

    public String[] getToppings() {
        return this.toppings;
    }

    public void setToppings(String[] newToppings) {
        this.toppings = newToppings;
    }

    public int getTiers() {
        return this.tiers;
    }

    public void setTiers(int newTiers) {
        this.tiers = newTiers;
    }

    public String getHappyBirthdayMessage(){
        return this.happyBirthdayMessage;
    }

    public void setHappyBirthdayMessage(String newHappyBirthdayMessage){
        this.happyBirthdayMessage = newHappyBirthdayMessage;
    }



//    CUSTOM METHODS


    public void addHappyBirthdayMessage(){
        this.happyBirthdayMessage = "Happy Birthday!";
    }
    //    OVERLOADING
    public void addHappyBirthdayMessage(String nameOfPerson){
        this.happyBirthdayMessage = "Happy Birthday, " + nameOfPerson + "!";
    }




//    ABSTRACT METHOD
    public void increaseSize(){
        if(this.tiers > 0 && this.tiers < 5){
            this.tiers++;
        }
    }
    public void reduceSize(){
        if(this.tiers > 1 && this.tiers < 6){
            this.tiers--;
        }
    }


}
