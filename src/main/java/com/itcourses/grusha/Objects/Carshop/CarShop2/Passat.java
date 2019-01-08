package com.itcourses.grusha.Objects.Carshop.CarShop2;


//import com.itcourses.grusha.Cars.Engines.Engine;

public class Passat {
    private static int passatNumbers;

    private Engine engine;
    private int topSpeed;


    {
        passatNumbers++;
    }

    public Passat(double engineDisplacement, String engineType, int topSpeed) {
        this.engine = new Engine(engineDisplacement, engineType);
        this.topSpeed = topSpeed;
        System.out.println("3 parameters constructor");
    }

    public Engine getEngine() {
        Engine temp = engine;
        engine = null;
        return temp;
    }

    public Passat(int topSpeed) {
        this(2.0, "Diesel", topSpeed);
    }

    public Passat() {
        this(200);
    }

    ;

    public static int getPassatNumbers() {
        return passatNumbers;
    }

    public double getEngineDisplacement() {
        return engine.getEngineDisplacement();
    }

    public String getEngineType() {
        return engine.getEngineType();
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return getEngineDisplacement() + " " + getEngineType() + " " + " with top speed " + getTopSpeed();
    }

    public void setNewEngine(Engine engine) {
        this.engine = engine;
    }

    public String makeNoise() {
        return this.engine.toString();
    }
}
