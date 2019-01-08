package com.itcourses.grusha.declaration;

public class OrderOfExecution {

    static int result = 10;

    public static void main(String[] args) {
        System.out.println("Result is :" + result);

        result = multiplyTwoNumbers(result,5);
        System.out.println("Result is :" + result);
    }

    static {
        System.out.println("Static block execution start");
        main(null);
    }

    private static int multiplyTwoNumbers(int firstNumber, int secondNumber) {

        int result = firstNumber * secondNumber;
        return result;
    }
}
