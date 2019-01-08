package com.itcourses.grusha.Objects.Interfaces;

public class InheritanceExample {

    public static void main(String[] args) {

        sayHello(new Dog());
        sayHello(new Robot());
    }

    public static void sayHello(Speakable somethingThatCanSpeak){

        System.out.println(somethingThatCanSpeak.speak());
    }

    public static void howManyLegs(Animal animal){
        System.out.println(animal.getNoOfLegs());
    }
}
