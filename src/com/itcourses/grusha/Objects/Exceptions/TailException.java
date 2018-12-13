package com.itcourses.grusha.Objects.Exceptions;

public class TailException extends RuntimeException {

    public TailException(String s) {
        super("Something wrong with this tail. " + s);
    }
}
