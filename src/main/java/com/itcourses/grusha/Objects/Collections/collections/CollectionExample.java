package com.itcourses.grusha.Objects.Collections.collections;

import com.itcourses.grusha.Objects.Collections.Cat;
import com.itcourses.grusha.Objects.Interfaces.Dog;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        //Create a List (try both ArrayList and LinkedList)
        // and fill it with your Objects(User).
        // Sort the list and print it, then apply shuffle them. And print them



        arrayList.add("firstElement");// array[0] = "firstlement"
        arrayList.add("secondElement");
        arrayList.get(0);  // array[0]
        arrayList.size(); // array.length


        System.out.println(arrayList);
//
        Set bucketWithCats = new TreeSet(new CatComparator());
        bucketWithCats.add(new Cat(true, "Fish", 4));
        bucketWithCats.add(new Cat(true, "hsiF", 4));
        bucketWithCats.add(new Cat(true, "Milk", 3));

        System.out.println(bucketWithCats);

        Comparator preciseComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Cat firstCat = (Cat) o1;
                Cat secondCat = (Cat) o2;

                if (firstCat.getNoOfLegs() == secondCat.getNoOfLegs()) {
                    return firstCat.getEats().compareTo(secondCat.getEats());
                } else if (firstCat.getNoOfLegs() > secondCat.getNoOfLegs())
                    return -1;
                else
                    return 1;

            }
        };
        Set preciseBucket = new TreeSet(preciseComparator);
        preciseBucket.add(new Cat(true, "Fish", 4));
        preciseBucket.add(new Cat(true, "hsiF", 4));
        preciseBucket.add(new Cat(true, "Milk", 3));
        System.out.println(preciseBucket);

        List<Cat> linkedList = new LinkedList<Cat>();
        linkedList = new LinkedList(preciseBucket);

            System.out.println(( linkedList.get(1)).speak());
    }
}
