package com.itcourses.grusha.declaration;

class A{
    public static void main(String[] args) {
        System.out.println();
    }
}

public class DifferentScope {
    public static  int result = 10;

     static {
        result = result + result;
        int result = 30;
        result = 0;
    }

    public static void main(String[] args) {
        System.out.println("Result is :" + result);
        int result = multiplyNumbers(5,5);
        System.out.println("Result is :" + result);
    }

    private static int multiplyNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber ;
        return result;
    }
}
