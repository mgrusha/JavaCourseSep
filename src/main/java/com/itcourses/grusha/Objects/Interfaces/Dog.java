package com.itcourses.grusha.Objects.Interfaces;

public  class Dog extends Animal implements Speakable {

    private int tailLength;

    private Dog(int tailLength){
        super(false,"meat",4);
        this.tailLength = tailLength;


    }

    public  Dog() {
    }

    @Override
    public void setEats(String eats) {

    }

    public static Dog dogProducer(int tailLength){;
        return new Dog(tailLength);
    }



    public int hashCode(){
        return 42;
    }

    public void wagTheTail(){
        if (tailLength<1)
         System.out.println("Don't have the tail");
        else
          System.out.println("Dog wags the tail");
    }

     public void setNoOfLegs(int number){
        super.toString();
     }

    @Override
    public String speak() {
        return "Woof woof";
    }

}
