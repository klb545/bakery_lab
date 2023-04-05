package org.example;

import enums.Size;

public class Traybake extends BakedGood{
    private String shape;
    private Size size;
    private boolean healthier;


    public Traybake(String name, String baseFlavour, double cost, double sellPrice, String shape, Size size){
        super(name, baseFlavour, cost, sellPrice);
        this.shape = shape;
        this.size = size;
        this.healthier = false;

    }

    public String getShape() {
        return this.shape;
    }

    public void setShape(String newShape) {
        this.shape = newShape;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }

    public boolean isHealthier() {
        return this.healthier;
    }

    public void setHealthier(boolean updatedHealthierStatus) {
        this.healthier = updatedHealthierStatus;
    }



    //    ABSTRACT METHOD
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
