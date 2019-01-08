package com.itcourses.grusha.Objects.Collections.Task;

public class User implements Comparable {
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private String lastName;
    private int age;


    public User(String name, String lastName, int age) {
        this.age = age;
        this.lastName = lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + " " + lastName + " " + age + "]";
    }

    @Override
    public int compareTo(Object o) {
        User au = (User) o;
        if (this.age > (au.getAge())) {
            return -1;
        } else if (this.age < (au.getAge())) {
            return 1;
        } else {
            if (this.name.compareTo(au.getName()) == 0) {
                return this.name.compareTo(au.getLastName());
            } else {
                return this.name.compareTo(au.getName());
            }
        }
    }
}
