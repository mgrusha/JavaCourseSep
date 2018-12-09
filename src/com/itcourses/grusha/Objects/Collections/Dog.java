package com.itcourses.grusha.Objects.Collections;

public  class Dog extends Animal implements Comparable{

    private int tailLength;

    public Dog(int tailLength){
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


    public String speak() {
        return "Woof woof";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Dog) {
            Dog anotherDog = (Dog) o;
            if (this.getNoOfLegs() == anotherDog.getNoOfLegs()) {
                    return this.getEats().compareTo(anotherDog.getEats());
            } else if (this.getNoOfLegs() > anotherDog.getNoOfLegs())
                return -1;
            else
                return 1;
        }
        else
            return -1;
    }
}
