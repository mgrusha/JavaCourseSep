package com.itcourses.grusha.Objects.Carshop.CarShop2;

public class CarShop {
    public static void main(String[] args) {
        Passat simplePassat = new Passat(1.4,"Petrol",180);

        System.out.println("This passat is " + simplePassat);

        Consultant x = new Consultant("Simpson", 2);
   //     System.out.println(x +" sold "+x.soldCars);
        sellCar(x,simplePassat);
  //      System.out.println(x +" sold "+x.soldCars);
    }

    public static void sellCar( Consultant z, Passat car){
        z.consultantName = "Doe";
        System.out.println(z+" just sold Passat with "+car);

    }

}

class Consultant{
    public String consultantName;
    public int soldCars;

    public Consultant(String consultantName,int sold){
        this.soldCars = sold;
        this.consultantName = consultantName;
    }
    public String toString(){
        return consultantName;
    }
}
