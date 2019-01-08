package com.itcourses.grusha.Objects.Inheritance;

public class Dog extends Animal {

    private int tailLength;

    public Dog(int tailLength) {
        super(false, "meat", 4);
        this.tailLength = tailLength;
    }

    public Dog() {

    }

    @Override
    public String getEats() {
        return super.getEats();
    }

    public void wagTheTail() {
        if (tailLength < 1)
            System.out.println("This dog doesn't have the tail");
        else
            System.out.println("Dog wags the tail");
    }

    public void setNoOfLegs(int number) {
        super.toString();
    }

}
