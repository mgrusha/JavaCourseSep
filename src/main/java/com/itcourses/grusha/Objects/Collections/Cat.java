package com.itcourses.grusha.Objects.Collections;

public class Cat extends Animal {

    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }

    @Override
    public void setEats(String eats) {

    }


    public String speak() {
        return "Meow-meow";
    }

    public Cat(boolean veg, String food, int legs,String color){
        super(veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat "+ "with "+ getNoOfLegs() + " legs";
    }


}
