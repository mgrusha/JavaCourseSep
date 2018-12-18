package com.itcourses.grusha.Objects.Exceptions;

public class Asserts {
    public static void main(String[] args) {
        assert (add2Numbers(0, 0) == 0) : "Result should be 0";
        assert (add2Numbers(1, 3) == 4) : "Result should be 4";;
        assert add2Numbers(2, 2) == 4 : "Function doesn't work";
        assert add2Numbers(-1, -1) == -2 : "Function doesn't work";
    }

    private static int add2Numbers(int firstArgument, int secondArgument) {
        return firstArgument-secondArgument;
    }
}
