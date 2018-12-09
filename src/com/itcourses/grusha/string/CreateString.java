package com.itcourses.grusha.string;

public class CreateString {
    public static void main(String[] args) {
        String usualWay = new String("Object way");
        String implicitWay = "Implicit way";
        String addingWay = 'a' + 1 + " ";
        char[] charArray = {'c', 'h', 'a', 'r'};
        String charArrayString = new String(charArray);
        System.out.println(usualWay);
        System.out.println(implicitWay);
        System.out.println(addingWay);
        System.out.println(charArrayString);
    }
}
