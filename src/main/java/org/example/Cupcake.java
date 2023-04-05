package org.example;

import enums.Size;

public class Cupcake extends Sponge {
    private boolean chocolateChips;
    private boolean cherry;
    private boolean sprinkles;
    private Size size;


    public Cupcake(String name, String baseFlavour, double cost, double sellPrice, String icingColour, Size size){
        super(name, baseFlavour, cost, sellPrice, icingColour);
        this.size = size;
        this.chocolateChips = false;
        this.cherry = false;
        this.sprinkles = false;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }

    public boolean hasChocolateChips() {
        return this.chocolateChips;
    }

    public boolean hasCherry() {
        return this.cherry;
    }

    public boolean hasSprinkles() {
        return this.sprinkles;
    }



    //    CUSTOM METHODS
    public void addChocolateChips(){
        if(!this.chocolateChips){
            this.chocolateChips = true;
        }
    }
    public void removeChocolateChips(){
        if(this.chocolateChips){
            this.chocolateChips = false;
        }
    }
    public void addCherry(){
        if(!this.cherry){
            this.cherry = true;
        }
    }
    public void removeCherry(){
        if(this.cherry){
            this.cherry = false;
        }
    }
    public void addSprinkles(){
        if(!this.sprinkles){
            this.sprinkles = true;
        }
    }
    public void removeSprinkles(){
        if(this.sprinkles){
            this.sprinkles = false;
        }
    }



//    ABSTRACT METHODS
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
