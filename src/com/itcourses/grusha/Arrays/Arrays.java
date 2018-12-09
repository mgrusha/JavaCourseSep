package com.itcourses.grusha.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3};

        int[] b = a;
        System.out.println("Second element of a array: " + a[1]);
        b[1] = 9;
        System.out.println("Second element of b array: " + b[1]);
        System.out.println("Second element of a array: " + a[1]);
    }
}
