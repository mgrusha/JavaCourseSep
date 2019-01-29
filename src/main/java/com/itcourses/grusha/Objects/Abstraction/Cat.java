package com.itcourses.grusha.Objects.Abstraction;

import com.itcourses.grusha.Annotations.TestAnnotations;

@TestAnnotations(doublecheck = false,msg = "cat")
public class Cat extends Animal{

    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }


    public int getNoOfLegs() {
        return this.noOfLegs;
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



}
