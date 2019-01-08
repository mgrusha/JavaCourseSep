package com.itcourses.grusha.Objects.Collections.Task;

import com.itcourses.grusha.Objects.Inheritance.Animal;
import com.itcourses.grusha.Objects.Inheritance.Cat;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map firstMap = new HashMap();
        System.out.println(firstMap);
        String key = "key";
        firstMap.put(key,key);
        System.out.println("1"+firstMap);

        firstMap.put(key,2);
        System.out.println("2"+firstMap);

        firstMap.put("key2",key);
        System.out.println("3:"+firstMap);

        firstMap.put("key2",3);
        System.out.println("4:"+firstMap);

        System.out.println("5:"+firstMap.entrySet());

        Map secondMap = new TreeMap(firstMap);
        firstMap.putAll(firstMap);
        firstMap.putAll(firstMap);

        firstMap.put("key4", " not may Name");

        System.out.println("6:"+firstMap);

//        System.out.println(((List)firstMap.get("key4")).get(2));

        System.out.println(firstMap.get("key4"));

        LinkedList<String> firstList = new LinkedList<String>();
        firstList.add("get");
        System.out.println(firstList.get(0));

        Map<Integer,Animal> map = new TreeMap<Integer,Animal>();

       System.out.println("3"+map.get("string"));

    }
}
