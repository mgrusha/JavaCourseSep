package com.itcourses.grusha.Exam;

public class SecondTask {
    public static void main(String[] args) {
        String[] array = {"a c d", "b", "String"};
        int timeToRepeat = 2;
        array = duplicateStringArray(array, timeToRepeat);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ; ");
        }
    }

    public static String[] duplicateStringArray(String[] array, int timeToRepeat) {
        String[] tempStringArray = new String[array.length * timeToRepeat];
        int tempArrayPointer = 0;
        for (int i = 0; i < array.length; i++) {
            int numberOfIterations = timeToRepeat;
            while (numberOfIterations > 0) {
                tempStringArray[tempArrayPointer++] = array[i];
                numberOfIterations--;
            }
        }
        return tempStringArray;
    }
}
