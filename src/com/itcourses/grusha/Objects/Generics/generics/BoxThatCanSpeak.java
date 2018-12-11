package com.itcourses.grusha.Objects.Generics.generics;


import com.itcourses.grusha.Objects.Interfaces.Speakable;

public class BoxThatCanSpeak<T extends Speakable> {

    private T t;

    public void add(T t) {
        this.t = t;
    }


    public String saySmthFromBox(){
        return t.speak();
    }
}
