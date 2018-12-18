package com.itcourses.grusha.Objects.Exceptions;

class TestEx1 extends RuntimeException { }
class SecondTestEx1 extends RuntimeException { }

public class Example1 {
    public static void main(String args[]) {

        try {
            throw new TestEx1();
        }
        catch(TestEx1 t) {
            System.out.println("Got the Test Exception");
        }
        finally {
            System.out.println("Inside finally block ");
        }
    }
}
