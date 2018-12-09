package com.itcourses.grusha;

public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println((i + 1) + " element is " + args[i]);
    }
}
