package com.itcourses.grusha.Objects.Carshop;

public class Passat {
    private static int passatNumbers;

    public double m_engineDisplacement;
    public String engineType;
    public int topSpeed;

    {
        passatNumbers++;
    }

   public Passat(double engineDisplacement, String engineType, int topSpeed) {

        this.m_engineDisplacement = engineDisplacement;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
        System.out.println("3 parameters constructor");
    }



    public Passat(int topSpeed)
    {
       this(0,"Diesel",topSpeed);


    }



    public Passat(){


    };

    public static int getPassatNumbers() {
        return passatNumbers;
    }

    public double getM_engineDisplacement() {
        return m_engineDisplacement;
    }

    public void setM_engineDisplacement(double m_engineDisplacement) {
        this.m_engineDisplacement = m_engineDisplacement;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return m_engineDisplacement + " " + engineType + " " + " with top speed " + topSpeed;
    }

}
