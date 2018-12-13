package com.itcourses.grusha.Objects.Generics;

import com.itcourses.grusha.Objects.Interfaces.Dog;
import com.itcourses.grusha.Objects.Interfaces.Robot;

public class GenericsExample {
    public static void main(String... args) {
        int i = 1;
        Integer refI = new Integer(i);
        System.out.println(1+2+""+3+4);

        refI = Integer.parseInt(""+1+2+3+4);

        System.out.println(refI);


        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("Array characterArray contains:");
     //   printArray(charArray);   // pass a Character array

        System.out.println("Print one element");
       // printArray(new String("12"));
     }


    public static <E extends Number> void printArray(E... inputArray) {
        // Display array elements
        float sum = 0;
        for (E element : inputArray) {
            sum = element.floatValue()+element.floatValue();
            //System.out.print(sum);
        }
        System.out.println(sum);
    }
}