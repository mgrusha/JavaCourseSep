package com.itcourses.grusha.Objects.Abstraction;

public  class AngryDog extends Dog{

    @Override
    public  void wagTheTail(){
        System.out.println("Dog is angry");
    };

    void wagTheTail(int param){
        System.out.println("No. As well");
    }
}
