package com.itcourses.grusha.Objects.Inheritance;

import com.itcourses.grusha.Exam.FirstTask;

public class InheritanceExample {

    public static void main(String[] args) {
        Dog dog = new Dog(2);
        Dog dog2 = new Dog();
        Animal animal = new Animal(false,"nothing",2);

     //   dog.wagTheTail();

        Cat cat = new Cat(false, "milk", 3, "black");

        System.out.println(dog instanceof Dog);


        whatIAmEating(cat);
        whatIAmEating(dog);
        whatIAmEating(new Integer(4));



/*
        AngryDog dog3 = new AngryDog();
        dog3.wagTheTail();
        dog3.wagTheTail(3);
        dog.wagTheTail();

        Dog dog4 = null;
        System.out.println(dog4 instanceof Object);

       /*
        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());*/
    }



    public static void whatIAmEating(Object object){

        if (object instanceof Dog){
            ((Dog)object).wagTheTail();
        }

    }




}
