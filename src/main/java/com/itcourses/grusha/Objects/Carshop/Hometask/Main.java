package com.itcourses.grusha.Objects.Carshop.Hometask;


public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield", 32);
        Cat dog1 = new Cat("Odie", 45);

        System.out.println("The cat's name is " + cat1.getName() + ", and its speed is " + cat1.getSpeed());
        System.out.println("The dog's name is " + dog1.getName() + ", and its speed is " + dog1.getSpeed());
        new SpeedComparator().compareSpeed(cat1, dog1);

    }

}

