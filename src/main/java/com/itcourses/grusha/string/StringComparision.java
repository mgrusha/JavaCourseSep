package com.itcourses.grusha.string;

public class StringComparision {
    public static void main(String[] args) {
        String firstString = "String";
        String secondString = new String("String");
        String thirdString = firstString;
        String fourthString = "Strin" + "g";
        System.out.println("== on first and second: " + (firstString == secondString));
        System.out.println("== on first and third: " + (firstString == thirdString));
        System.out.println("== on first and fourth: " + (firstString == fourthString));
    }
}
