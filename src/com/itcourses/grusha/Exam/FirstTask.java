package com.itcourses.grusha.Exam;

public class FirstTask {

    public static void main(String[] args) {
        int[] intArray = {-0, 7, 2, 4, 9, 10, 10, 10, 10, 10, 10, 3, 3, 3};
        int even = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("There are " + even + " even numbers");
        System.out.println("There are " + ((intArray.length) - even) + " odd numbers");

    }
}
