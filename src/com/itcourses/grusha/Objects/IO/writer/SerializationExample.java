package com.itcourses.grusha.Objects.IO.writer;

import com.itcourses.grusha.Objects.Interfaces.Robot;

import java.io.*;
import java.util.Date;

public class SerializationExample {
    public static void main(String[] args) {
        Robot robotForFuture = new Robot("T1000",3,"some iron");
        String filename = "D:\\trainings\\Java2018_1\\libs\\New folder\\RobotFile"+(new Date().getTime())+".txt";

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(robotForFuture);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Robot currentRobot = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{	    fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            currentRobot = (Robot) in.readObject();
            in.close();
        }	catch(IOException ex){	    ex.printStackTrace();	}
        catch(ClassNotFoundException ex){	    ex.printStackTrace();	}
        System.out.println("RobotName: " + currentRobot.getRobotName());
        //System.out.println(": " + currentRobot.speak());
    }
}
