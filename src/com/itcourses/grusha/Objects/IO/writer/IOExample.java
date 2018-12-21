package com.itcourses.grusha.Objects.IO.writer;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class IOExample {
    public static void main(String[] args) throws  IOException {
        //System.out.println(Arrays.toString("J".getBytes("UTF16")));
        //System.out.println(("J".getBytes("UTF16").length));
        char ch0 = 55378;
        char ch1 = 56816;
        String str = new String(new char[]{ch0,ch1});
        //System.out.println(str);
        //System.out.println(str.length());
        //System.out.println(str.charAt(0));
        //System.out.println(Arrays.toString(str.getBytes()));

        try( InputStream inFile = new FileInputStream("D:\\trainings\\helloworld.txt")){
            //Read.readFullyByArrayWithLength(inFile);
        }

        InputStream inUrl = new URL("http://google.com").openStream();
        Writer.writeFullyByByte(inUrl);

        InputStream inArray = new ByteArrayInputStream(new byte[]{65,66,67,66});


        //readFullyByByte(inFile);
        //readFullyByArray(inFile);
        //Read.readFullyByArrayWithLength(inFile);
        System.out.println("\n\n");

        //InputStream inUrl = new URL("http://google.com").openStream();
         //readFullyByByte(inUrl);

        //InputStream inArray = new ByteArrayInputStream(new byte[]{65,66,67,66});
        //readFullyByByte(inArray);


    }

}
