package com.itcourses.grusha.Variables;

public class Tasks {
    static {
        System.out.println("Second Block of code");
    }
    static {
        System.out.println("Block of code");
    }

    public static void main(String[] args) {
       multiplyByTwo(2);

    }



    public static int multiplyByTwo(int parameter) {
        parameter = parameter * 2;

        System.out.println(parameter);
        return parameter;
    }

}

class A {
}

class A2 {
}
