package com.itcourses.grusha.AspectProgramming;

import com.itcourses.grusha.Objects.Interfaces.Speakable;

public class AspectExample {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.killPeople();
        System.out.println(robot.speak());
    }


}

class Robot implements Speakable {
    private int numOfPeople;

    public void killPeople() {
        System.out.println(++numOfPeople + " killed");
    }

    @Override
    public String speak() {
        return "I am friendly robot";
    }
}
