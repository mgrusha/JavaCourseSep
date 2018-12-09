package com.itcourses.grusha.HasA;

import com.itcourses.grusha.Arrays.Arrays;

public class Main {
    public static void main(String[] args) {
        User vUser = new User("Nikita",30);
        User vUser2 = new User("Nikita2",10);
        User vUser3 = new User("Nikita3",20);
        User[] users = new User[0];

        AdressBook adressbook = new AdressBook();
        adressbook.addUser(vUser);
        adressbook.addUser(vUser2);
        adressbook.addUser(vUser3);
        System.out.println(adressbook);
    }
}

