package com.itcourses.grusha.Objects.IO.writer;

import com.google.gson.Gson;
import com.itcourses.grusha.Objects.Interfaces.Robot;

import java.util.ArrayList;
import java.util.List;

public class JsonSerExample {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Robot robotForFuture = new Robot("T800",10,"Iron");
        List<String> targets = new ArrayList<>();
        targets.add("Sarah Connor");
        targets.add("John Connor");
        robotForFuture.setTargets(targets);
        String jsonRobot = gson.toJson(robotForFuture);
        System.out.println(jsonRobot);

        Robot currentRobot = gson.fromJson(jsonRobot, Robot.class);
    }
}
