package com.itcourses.grusha.Objects.Collections.collections;

import com.itcourses.grusha.Objects.Collections.Cat;

import java.util.Comparator;

public class CatComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat firstCat = (Cat) o1;
        Cat secondCat = (Cat) o2;

        if (firstCat.getNoOfLegs() == secondCat.getNoOfLegs()) {
            return 0;
        } else if (firstCat.getNoOfLegs() > secondCat.getNoOfLegs())
            return -1;
        else
            return 1;

    }
}
