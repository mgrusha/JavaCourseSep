package com.itcourses.grusha.Objects.Interfaces;

public class AngryDog extends Dog {

    @Override
    public void wagTheTail() {
        System.out.println("No.");
    }

    void wagTheTail(int param){
        System.out.println("No. As well");
    }

    @Override
    public void setEats(String eats) {

    }

    public String speak() {
        return "angry Woof woof";
    }
}
