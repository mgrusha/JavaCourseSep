package com.itcourses.grusha.Objects.Abstraction;

public class InheritanceExample {

    public static void main(String[] args) {
        Dog dog = new Dog(2);
       // Dog dog2 = new Dog(true,"Meat",4);

        Animal animal = dog;


        dog.wagTheTail();

        howManyLegs(dog);
        Cat cat = new Cat(false, "milk", 3, "black");
        howManyLegs(cat);


        Dog dog2 = null;
      System.out.println(dog2 instanceof Object);

       /*
        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());*/
    }

   
    public static void howManyLegs(Animal animal){
        System.out.println(animal.getNoOfLegs());
    }
}
