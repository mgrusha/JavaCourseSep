package com.itcourses.grusha.declaration;

import java.util.Scanner;

public class ScannerCheck {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter age");
        int age = in.nextInt();
        System.out.println("Is client regular");
        boolean regular = in.nextBoolean();

        int discount = age > 65 ? regular ? 15 : 10 : age < 18 ? regular ? 30 : 5 : regular ? 5 : 0;
        System.out.println("discount is " + discount);
    }
}
