package com.itcourses.grusha.Exam;

public class FourthTask {
    public static void main(String[] args) {

        Table table1=new Table();
        table1.addOrderToTable("soup");
        table1.addOrderToTable("main meal");
        System.out.println(table1);

        Table table2=new Table();
        table2.addOrderToTable("potatoes");
        System.out.println(table2);

        Table table3=new Table();
        table3.addOrderToTable("soup2");
        table3.addOrderToTable("snacks");
        table3.addOrderToTable("chips");
        System.out.println(table3);

        Table table4=new Table();
        table4.addOrderToTable("pasta");
        System.out.println(table4);

        Table table5=new Table();
        table5.addOrderToTable("tosts");
        System.out.println(table5);
    }
}
