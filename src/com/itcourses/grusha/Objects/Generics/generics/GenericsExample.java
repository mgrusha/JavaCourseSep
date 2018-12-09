package com.itcourses.grusha.Objects.Generics.generics;

import com.itcourses.grusha.Objects.Interfaces.Dog;
import com.itcourses.grusha.Objects.Interfaces.Robot;


public class GenericsExample {
    public static void main(String args[]) {


        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("Array characterArray contains:");
        printArray(charArray);   // pass a Character array

        Box<Robot> catBox = new Box<>();
        catBox.add(new Robot());
      //  catBox.add(new Dog());

        BoxThatCanSpeak<Dog> dogBox = new BoxThatCanSpeak<Dog>();
        dogBox.add(new Dog());
        dogBox.saySmthFromBox();

        System.out.println("We have in Box" + catBox.getBoxTypeName());


    }


    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.print(element);
        }
        System.out.println();
    }
}