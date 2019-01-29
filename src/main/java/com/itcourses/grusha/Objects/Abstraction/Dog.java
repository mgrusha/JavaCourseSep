package com.itcourses.grusha.Objects.Abstraction;

import com.itcourses.grusha.Annotations.TestAnnotations;

@TestAnnotations(doublecheck = true,msg = "Dog")
public class Dog extends Animal {

    private int tailLength;

    public Dog(int tailLength){
        super(false,"meat",4);
        this.tailLength = tailLength;


    }



    public Dog(){

    }

    @Override
    public int getNoOfLegs() {
        System.out.println("In our universe we have only dogs with 4 legs");
        return 4;
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

}
