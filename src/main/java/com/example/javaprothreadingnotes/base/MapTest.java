package com.example.javaprothreadingnotes.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("123","123");
        map.put("1231","123");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        //拿到迭代器
        Iterator<Map.Entry<String,String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> next = iterator.next();
            if ("1231".equals(next.getKey())) {
                //移除map中 key == 1231的那项
                iterator.remove();
            }
        }
        map.forEach((k,v) -> System.out.println(k + "=====" + v));
    }

}
