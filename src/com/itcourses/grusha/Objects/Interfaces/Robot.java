package com.itcourses.grusha.Objects.Interfaces;

public class Robot implements Speakable, ForeignSpeakable{

    @Override
    public String speak() {
        return "Hi! I am a robot";
    }
}
