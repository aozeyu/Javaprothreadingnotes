package com.example.javaprothreadingnotes.net;

import java.util.HashMap;
import java.util.Map;

public class TestHashTable {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(5,"Five");
        m.put(8,"Eight");
        m.put(6, "Six");
        m.put(4, "Four");
        m.put(2, "Two");
        System.out.println(m.get(6));
        m.forEach((key,value) -> {
            //遍历每一个简直对
            String msg = key + " : " + value;
            System.out.println(msg);
        });
    }
}
