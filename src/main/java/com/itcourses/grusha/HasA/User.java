package com.itcourses.grusha.HasA;

public class User {
    private final int age;
    private final String userName;

    public User(String userName, int age) {
        this.age = age;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userName + " " + age;
    }
}
