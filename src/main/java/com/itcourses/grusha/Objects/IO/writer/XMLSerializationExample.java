package com.itcourses.grusha.Objects.IO.writer;

import com.itcourses.grusha.Objects.Interfaces.Robot;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XMLSerializationExample {
    public static void main(String[] args) throws Exception {
        Robot robotForFuture = new Robot("T800",10,"Iron");
        List<String> targets = new ArrayList<>();
        targets.add("Sarah Connor");
        targets.add("John Connor");
        robotForFuture.setTargets(targets);

        String filename = "D:\\trainings\\Java2018_2\\RobotFile" + (new Date().getTime()) + ".xml";
        write(robotForFuture,filename);
        Robot currentRobot = (Robot)read(filename);
        System.out.println("RobotName: " + currentRobot.getRobotName());
        System.out.println("And it says: " + currentRobot.speak());
        System.out.println("My targets: "+currentRobot.getTargets());
    }

    public static void write(Object f, String filename) throws Exception{
        XMLEncoder encoder =
                new XMLEncoder(
                        new BufferedOutputStream(
                                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public static Object read(String filename) throws Exception {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        Object o = (Object)decoder.readObject();
        decoder.close();
        return o;
    }
}
