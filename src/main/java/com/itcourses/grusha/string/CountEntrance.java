package com.itcourses.grusha.string;

public class CountEntrance {
    public static void main(String[] args) {
        String s = "";
        String sShorter = "aa";
        int licznik = 0;
        licznik = zliczanie(s, sShorter);
        System.out.println("\naa wystąpiło " + licznik + " razy");
    }

    public static int zliczanie(String s, String sShorter) {
        int licznik = 0;
        while (s.indexOf(sShorter) != -1) {
            licznik++;
            s = s.substring(s.indexOf(sShorter) + sShorter.length(), s.length());
        }
        return (licznik);
    }

}
