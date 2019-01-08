package com.itcourses.grusha.Exam;

public class Table {
    private int numberOfTable;
    public static int numberOfTablesUsed;
    private Order[] ordersArray = new Order[0];

    {
        numberOfTablesUsed++;
        numberOfTable = numberOfTablesUsed;
    }

    public Table() {
        if (numberOfTablesUsed == 5) {
            System.out.println("this is last table you can create");
        }
    }

    public void addOrderToTable(String orderName) {
        Order[] newArrayOfOrders = new Order[this.ordersArray.length + 1];
        for (int i = 0; i < this.ordersArray.length; i++) {
            newArrayOfOrders[i] = ordersArray[i];
        }
        newArrayOfOrders[newArrayOfOrders.length - 1] = new Order(orderName);
        this.ordersArray = newArrayOfOrders;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Table" + numberOfTable + "\n");
        for (int i = 0; i < ordersArray.length; i++) {
            string.append(ordersArray[i]);
        }
        return string.toString();
    }

}
