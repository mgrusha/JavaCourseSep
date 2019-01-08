package com.itcourses.grusha.loops;

import java.util.concurrent.ThreadLocalRandom;

public class BreakContinue {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            while (true) {
                x = ThreadLocalRandom.current().nextInt(0, 100);
                if (x == 20) {
                    System.out.println("Enough x is " + x + " now");
                    break;
                } else {
                    System.out.println("let's continue x is not 20 yet. X is " + x);
                }
            }
            break;
        }
    }
}
