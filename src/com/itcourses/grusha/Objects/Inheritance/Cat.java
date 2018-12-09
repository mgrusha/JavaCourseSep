package com.itcourses.grusha.Objects.Inheritance;

import com.itcourses.grusha.Objects.Inheritance.Animal;

public class Cat extends Animal {

    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "White";
    }

    public Cat(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        super.vegetarian = true;
        super.getNoOfLegs();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
