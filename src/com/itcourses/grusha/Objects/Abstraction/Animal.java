package com.itcourses.grusha.Objects.Abstraction;

public abstract class Animal {

    private boolean vegetarian;

    private String eats;

    protected int noOfLegs;

    public Animal(){
        this(true,null,0);
    }

    public Animal(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public abstract int getNoOfLegs();

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

}
