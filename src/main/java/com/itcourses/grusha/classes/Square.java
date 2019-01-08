package com.itcourses.grusha.classes;

public class Square {
    public static int numberOfFigures;

    public int getSideLength() {
        return sideLength;
    }

    static {
        System.out.println("Class block of code");
    }
    private int sideLength;


    public String anotherColor;
    private String color = "Transparent";

    {
        System.out.println("Object block of code");
        numberOfFigures++;
    }



    public boolean equals(Square square) {


       if (this.sideLength==square.sideLength && this.color.equals(square.color))
           return true;
       else
           return false;
    }

    public static int getNumberOfFigures() {
        return numberOfFigures;
    }

    public void setSideLength(int sideLength) {
        if (sideLength<0){
            sideLength =0;
        }
        this.sideLength = sideLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPerimeter() {
        return sideLength * 4;
    }

    public int getArea() {
        return sideLength * sideLength;
    }

}
