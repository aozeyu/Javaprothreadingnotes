package com.example.javaprothreadingnotes.zhouyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryTest {
    public static void main(String[] args) {
        Map<String,Integer> ageMap = new HashMap<String,Integer>();
        ageMap.put("qinxiaohui",23);
        ageMap.put("morflame",20);
        Set<Map.Entry<String,Integer>> entrySet = ageMap.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet
             ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
