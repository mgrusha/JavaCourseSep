package com.itcourses.grusha.Objects.Carshop;

public class CarShop {
    public static void main(String[] args) {
        int i = 4;
        Passat simplePassat = new Passat();
        Passat anotherPassat = new Passat(1);
        new Passat(2,"",2);

        simplePassat.m_engineDisplacement = 1.4;
        simplePassat.topSpeed = 180;
        simplePassat.engineType = "Petrol";
        simplePassat.getEngineType();

        //System.out.println("This passat is " + simplePassat);

    }
}
