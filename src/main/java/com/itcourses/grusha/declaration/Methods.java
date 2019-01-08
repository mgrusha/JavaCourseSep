package com.itcourses.grusha.declaration;

public class Methods {
    public static void main(String[] args) {
        int result = multiplyNumbers(5,5);
        System.out.println("Result is :" + result);
    }

    private static int multiplyNumbers(int firstNumber, int secondNumber) {
        int temporaryVariable = firstNumber * secondNumber;
        return temporaryVariable;
    }
}
