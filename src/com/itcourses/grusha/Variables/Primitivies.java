package com.itcourses.grusha.Variables;

public class Primitivies {

    public static void main(String[] args) {
        //declare
        byte b1, b2;

         int constant;
        constant = 1;
        constant = 2;

        //initialize
        b1 = 1;
        System.out.println("Byte b1 is " + b1);
        b1 = 127;
        System.out.println("Now byte b1 is " + b1);

        //declare + initialize
        int int1 = 200;

        //mixed approach
        short s1, s2 = 44, s3;

        //long should have L in the end
        long long1 = 5L, long2 = 5;

        //we could do widening operation
        long2 = int1;

        System.out.println("Now long l2 is:" + long2);

        //but we couldn't do narrowing
        //int1 = long1;
        //s1 = i1;
        //b1 = s2;


        //We couldn't print values that are not initialized
        //System.out.println(s1);

        char c1 = 'b';
        System.out.println("Now char c1 is [" + c1 + "]");
        c1 = 66;
        System.out.println("After changing char c1 is [" + c1 + "]");
        final char c2 = 'a';
        int charVal = c1;
        //      c2='b';
        //      c2='c';

        boolean bool1 = true;
        boolean bool2 = false;
    }

}
