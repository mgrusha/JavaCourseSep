package com.itcourses.grusha.string;

public class StringEquality {
    public static void main(String[] args) {
        String firstString = "String";
        String secondString = new String("gnirtS");
        System.out.println("Equals on first and second: " + (firstString.equals(secondString)));
        System.out.println("EqualsIgnoreCase on first and second: " + (firstString.equalsIgnoreCase(secondString)));
        System.out.println("CompareTo on first and second: " + (firstString.compareTo(secondString)));
    }
}
