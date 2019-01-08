package com.itcourses.grusha.Objects.Collections.Task;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        List users = new ArrayList();
        Collection anotherUsers = new LinkedList();


        users.add(new User("John", "Galt", 33));
        users.add(new User("Donald", "Trump", 45));
        users.add(new User("Donald", "Duck", 5));
        users.add(new User("Arnold", "Hero", 72));
        users.add(new User("Richard", "Feynman", 83));
        users.add(new User("MR", "X", 52));
        users.add(new User("MR", "X", 35));
        users.add(new User("Garry", "Potter", 35));
        users.add(new User("Big", "Boss", 23));

        anotherUsers.addAll(users);
        System.out.println("Unsorted collections " + users);

        Collections.sort(users, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println(users);

        TreeSet treeSetForUser = new TreeSet(anotherUsers);
        System.out.println("Sorted collection" + treeSetForUser);

        Collections.shuffle(users);
        System.out.println("Unsorted collection " + users);

        TreeSet unsortedSet = new TreeSet(new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {

                return new Random().nextInt(20) - 10;
            }
        });
        unsortedSet.addAll(anotherUsers);
        System.out.println("Unsorted collection " + unsortedSet);
    }
}
