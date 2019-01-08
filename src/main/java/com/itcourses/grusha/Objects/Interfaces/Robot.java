package com.itcourses.grusha.Objects.Interfaces;

import java.io.Serializable;
import java.util.List;

public class Robot implements Speakable, ForeignSpeakable, Serializable {

    private String robotName;
    private int age;
    private  String madeFrom;

    List<String> targets;

    public Robot() {

    }

    public String getRobotName() {
        return robotName;
    }

    public int getAge() {
        return age;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public List<String> getTargets() {
        return targets;
    }

    public void setTargets(List<String> targets) {
        this.targets = targets;
    }


    public Robot(String robotName, int number, String madeFrom) {
      this.robotName = robotName;
      this.age = number;
      this.madeFrom = madeFrom;
    }

    @Override
    public String speak() {
        return "Hi! I am a robot";
    }
}
