package com.itcourses.grusha.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

     /*   System.out.println(sumAll(numbers, n -> true));
        System.out.println(sumAll(numbers, n -> n % 2 == 0));
        System.out.println(sumAll(numbers, n -> n > 3));
*/
       System.out.println(numbers.stream().filter(n -> n % 2 == 0).mapToInt(x->x).sum());
       System.out.println(numbers.stream().map(x->x*x).collect(Collectors.toList()));
    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

}
