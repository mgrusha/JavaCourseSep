package com.itcourses.grusha.Variables;

public class FloatTrick {
    public static void main(String[] args)
    {
        for (String element: args) {
            System.out.println(element);
        }
    }

    static void printPattern(int n) {
        int line = 1;
        int star = n;

        System.out.println("\n" + n + " Stars");
        for (line = 0; line < n; ) {
            if (star >= line) {
                System.out.print("*");
                star--;
            }
            if (star == line && line != n) {
                System.out.println("\n" + (n - star - 1) + " Stars");
                line++;
                star = n;
            }
        }


    }
}
