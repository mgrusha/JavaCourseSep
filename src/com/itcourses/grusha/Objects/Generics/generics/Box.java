package com.itcourses.grusha.Objects.Generics.generics;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public String getBoxTypeName(){
        return t.getClass().getTypeName();
    }
}
