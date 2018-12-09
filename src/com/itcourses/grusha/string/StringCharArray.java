package com.itcourses.grusha.string;

public class StringCharArray {
    public static void main(String[] args) {
        String example = "This is String example";
        char[] exampleCharArray = example.toCharArray();
        for (char charElement : exampleCharArray) {
            System.out.println(charElement);
        }
    }
}
