package com.itcourses.grusha.classes;




public class Main {
    public static void main(String[] args) {
        Square smallSquare = new Square();
        //Square bigSquare = new Square();
        System.out.println("By default variable is "+smallSquare.anotherColor);

        smallSquare.setSideLength(5);
        smallSquare.setColor("Red");

        Square bigSquare = new Square();
        bigSquare.setSideLength(25);

        System.out.println("Area of BigSquare is " + bigSquare.getArea() + " and it is " + bigSquare.getColor());
        System.out.println("Area of SmallSquare is " + smallSquare.getArea() + " and it is " + smallSquare.getColor());
        System.out.println("Total number of objects is " + Square.getNumberOfFigures());

        Square anotherSmallSquare = new Square();
        anotherSmallSquare.setSideLength(5);
        anotherSmallSquare.setColor("Red");

        Square mySquare = new Square();

        System.out.println( mySquare.equals(bigSquare));
        Square.numberOfFigures = 0;

        System.out.println(smallSquare.equals(anotherSmallSquare));

    }
}



