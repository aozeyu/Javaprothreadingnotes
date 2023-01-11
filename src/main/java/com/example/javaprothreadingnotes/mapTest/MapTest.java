package com.example.javaprothreadingnotes.mapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

        // Initializing a Map of type HashMap
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        System.out.println(map);
        s = map.keySet();
        //打印出key
        System.out.println(s);
    }
}
