package com.itcourses.grusha.Objects.IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Read {
    public static void readFullyByByte(InputStream inFile) throws IOException {
        int oneByte;
        while ((oneByte = inFile.read()) != -1) {
            System.out.println((char) oneByte);
        }
        /*while (true) {
            int oneByte = inFile.read();
            if (oneByte != -1) {
                System.out.println((char) oneByte);

            } else {
                System.out.println("\n");
                break;
            }
        }*/
    }

    public static void readFullyByArray(InputStream inFile) throws IOException {
        byte[] buff = new byte[2000];
        while (true) {
            int count = inFile.read(buff);
            if (count != -1) {
                /*System.out.println(new String(buff, 0, count));*/
                System.out.println("count = " + count +
                        ", buff = " + Arrays.toString(buff) +
                        ", str = " + new String(buff, 0, count));
                continue;
            }
            break;
        }
    }

    public static void readFullyByArrayWithLength(InputStream inFile) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = inFile.read(buff, 1, 3);
            if (count != -1) {
                System.out.println("count = " + count +
                        ", buff = " + Arrays.toString(buff) +
                        ", str = " + new String(buff, 0, count));
                continue;
            }
            break;
        }
    }
}
