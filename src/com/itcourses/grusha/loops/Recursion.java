package com.itcourses.grusha.loops;

public class Recursion {
    public static void main(String[] args) {
        printNumbers(0, 2000000000);
        System.out.println(calculateFibonacci(10));
    }

    public static int printNumbers(int currentNumber, long maxNumber) {
        if (currentNumber < maxNumber) {
            System.out.println(currentNumber);
            return printNumbers(++currentNumber, maxNumber);
        }
        return 0;
    }


    public static int calculateFibonacci(int fibNum) {
        if (fibNum < 2)
            return fibNum;
        else
            return (calculateFibonacci(fibNum - 1) + calculateFibonacci(fibNum - 2));
    }
}
