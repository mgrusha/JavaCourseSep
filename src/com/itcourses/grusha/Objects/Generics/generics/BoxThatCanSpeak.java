package com.itcourses.grusha.Objects.Generics.generics;


import com.itcourses.grusha.Objects.Interfaces.Speakable;

public class BoxThatCanSpeak<T extends Speakable> extends Box{

    public void saySmthFromBox(){
        ((Speakable)get()).speak();
    }
}
