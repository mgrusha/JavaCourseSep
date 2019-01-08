package com.itcourses.grusha.Objects.Exceptions;

class MyOwnException extends RuntimeException {
    public MyOwnException() {
        super("Something went wrong");
    }

    ;
}

public class ExceptionExample {

    private static int exitCode = 0;

    public static void main(String[] args) {
        try {
            try {
                System.out.println("Block B");
                throw new MyOwnException();
            } catch (MyOwnException e) {
                throw new MyOwnException();
            } catch (Exception e) {
                System.out.println("Block B");
            } finally {
                System.out.println("Executed ");
            }


        } catch (MyOwnException e) {
            System.out.println("Block A1");
        } catch (Exception e) {
            System.out.println("Block A2");
        } finally {
            System.out.println("Executed ");
        }
    }

    private static int getResult(int dividend, int divider) {

        throw new MyOwnException();


    }



        /*  assert add2Numbers(1,3)==4 : "Function doesn't work";
        assert add2Numbers(2,2)==4 : "Function doesn't work";
        assert add2Numbers(-1,-1)==-2 : "Function doesn't work";*/
}
