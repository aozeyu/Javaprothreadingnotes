package com.example.javaprothreadingnotes.lizi6;

import java.util.HashMap;
import java.util.Map;

public class ClientTest {
    public static void main(String[] args) {
        Map<Integer,String> empMap = new HashMap<>();
        empMap.put(190292,"Martin");
        empMap.put(190928,"Farnk");
        empMap.put(902292,"Andrew");
        //有的话返回值没有的话返回默认值
        String rocky = empMap.getOrDefault("100001", "Rocky");
        String rocky1 = empMap.getOrDefault(190292, "Rocky");
        System.out.println(rocky);
        System.out.println(rocky1);

        empMap.forEach((k,v) -> {
            // 空格
            System.out.println(k + "\t" + v);
        });
    }
}
