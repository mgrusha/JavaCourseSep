package com.itcourses.grusha.Exam;

public class Order {
    private String name;
    private  int number;
    private static int numberOfOrders;

    {
        numberOfOrders++;
        this.number=numberOfOrders;
    }

    public Order(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name + " | " + number + " | \n" ;
    }

}
