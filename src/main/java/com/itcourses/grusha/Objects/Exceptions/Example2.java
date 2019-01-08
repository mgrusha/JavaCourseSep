package com.itcourses.grusha.Objects.Exceptions;

class TestEx2 extends Exception {
    public TestEx2(String str) {
        super("Exception " + str);
    }
}

class SecondTestEx2 extends RuntimeException {
    public SecondTestEx2(String str) {
        super("RTException " + str);
    }
}

public class Example2 {
    public static void main(String[] args) {
        try {
            try {
                throw new SecondTestEx2("1");
            } catch (SecondTestEx2 e) {
                throw new Error("2");
            } finally {
                throw new SecondTestEx2("3");
            }
        } catch (SecondTestEx2 exception) {
            System.out.println(exception.getMessage());
        }

    }
}
