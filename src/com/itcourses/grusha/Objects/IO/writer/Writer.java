package com.itcourses.grusha.Objects.IO.writer;

import java.io.*;
import java.util.Date;

public class Writer {
    public static void writeFullyByByte(InputStream inFile)  {
        File file = new File("D:\\trainings\\Java2018_2\\testfile"+(new Date().getTime())+".txt");


        OutputStream out = null;
        try {
            out = new FileOutputStream(file);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            int oneByte;
            while ((oneByte=inFile.read())!=-1){

                out.write(oneByte);
            }

            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
