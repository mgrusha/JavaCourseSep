package com.itcourses.grusha.Objects.Carshop.Hometask;

public class SpeedComparator {
    public void compareSpeed(Cat cat1, Cat dog1) {
        if (cat1.getSpeed() > dog1.getSpeed()) {
            System.out.println("Cat is faster");
        } else if (dog1.getSpeed() > cat1.getSpeed()) {
            System.out.println("Dog is faster");
        } else {
            System.out.println("The cat and the dog are equally fast");
        }

    }
}
