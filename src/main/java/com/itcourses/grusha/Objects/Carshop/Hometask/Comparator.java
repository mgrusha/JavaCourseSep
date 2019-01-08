package com.itcourses.grusha.Objects.Carshop.Hometask;

import com.itcourses.grusha.Objects.Carshop.Hometask.Circle;

public class Comparator {

    public Circle comparing(Circle a, Circle b, Circle c) {
        if (a.getCircleLenght() > b.getCircleLenght() &&
                a.getCircleLenght() > c.getCircleLenght()) {
            return a;
        }
        if (b.getCircleLenght() > a.getCircleLenght() &&
                b.getCircleLenght() > c.getCircleLenght()) {
            return b;
        }
        if (c.getCircleLenght() > a.getCircleLenght() &&
                c.getCircleLenght() > b.getCircleLenght()) {
            return c;
        }
        return null;
    }
}
