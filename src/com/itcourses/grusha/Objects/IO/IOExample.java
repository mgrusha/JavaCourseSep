package com.itcourses.grusha.Objects.IO;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class IOExample {
    public static void main(String[] args) throws IOException {
        //  System.out.println(Arrays.toString("C".getBytes("UTF16")));
        //  System.out.println(("C".getBytes("UTF16").length));
       /* char ch0 = 55378;
        char ch1 = 56816;
        String str = new String(new char[]{ch0,ch1});
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(Arrays.toString(str.getBytes()));*/

        InputStream inFile = new FileInputStream("D:\\trainings\\Java2018_2\\lesson19\\helloworld.txt");
       // Read.readFullyByByte(inFile);

        inFile.close();

        InputStream inUrl = new URL("http://google.com").openStream();
       //    Read.readFullyByArray(inUrl);

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 66});

        //readFullyByByte(inFile);
        //readFullyByArray(inArray);
        Read.readFullyByArrayWithLength(inArray);
        //System.out.println("\n\n");

        //InputStream inUrl = new URL("http://google.com").openStream();
        //readFullyByByte(inUrl);

        //InputStream inArray = new ByteArrayInputStream(new byte[]{65,66,67,66});
        //readFullyByByte(inArray);

    }

}
