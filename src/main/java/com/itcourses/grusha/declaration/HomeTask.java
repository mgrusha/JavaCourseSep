package com.itcourses.grusha.declaration;

public class HomeTask {
    public static void main(String[] args) {
        boolean regularClient = true;
        int discount = discountCalc(63, regularClient);
        // discount = age > 65 ? regular ? 15 : 10 : age < 18 ? regular ? 30 : 5 : regular ? 5 : 0;

        System.out.println("Discount is " + discount);
    }

    public static int discountCalc(int age, boolean regularClient) {
        int discount = 0;
        if (age >= 65) {
            discount = 10;
        } else if (age < 18) {
            discount = 25;
        }
        if (regularClient) {
            discount = discount + 5;
        }
        return discount;
    }
}


