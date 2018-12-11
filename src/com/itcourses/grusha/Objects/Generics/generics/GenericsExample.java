package com.itcourses.grusha.Objects.Generics.generics;

import com.itcourses.grusha.Objects.Collections.Cat;
import com.itcourses.grusha.Objects.Interfaces.Dog;
import com.itcourses.grusha.Objects.Interfaces.Robot;
import com.itcourses.grusha.Objects.Interfaces.Speakable;


public class GenericsExample {
    public static void main(String args[]) {

        Box<Cat> catBox = new Box<>();
        catBox.add(new Cat(true,"Milk",3));
        System.out.println(catBox.get().speak());
      //  catBox.add(new Dog());

        BoxThatCanSpeak<Robot> box = new BoxThatCanSpeak<Robot>();
       // box.add(new Dog());
        box.add(new Robot());
        System.out.println(box.saySmthFromBox());

      //  System.out.println("We have in Box" + catBox.getBoxTypeName());


    }


    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.print(element);
        }
        System.out.println();
    }
}