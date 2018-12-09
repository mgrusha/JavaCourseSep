package com.itcourses.grusha.HasA;

import java.util.Arrays;

public class AdressBook {
    private User[] users;

    public AdressBook(User[] users) {
        this.users = Arrays.copyOf(users == null ? new User[0] : users, 2);
    }

    public AdressBook() {
        this(null);
    }

    public void addUser(User vUser) {
        if (users[users.length - 1] == null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = vUser;
                    break;
                }
            }
        } else {
            users = Arrays.copyOf(users, (users.length * 2 + 1));
            addUser(vUser);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (User user : users) {
            if (user != null)
                stringBuilder.append(user.toString() + " ; ");
        }
        return stringBuilder.toString();
    }
}
