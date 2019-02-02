package com.itcourses.grusha.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CalcExample {
    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3);
          final int z=2;

        Consumer<Integer> lambda = System.out::println   ;
        intSeq.forEach(lambda);


    }
}
