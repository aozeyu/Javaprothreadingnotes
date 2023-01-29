package com.example.javaprothreadingnotes.Jedis;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DisplayName2 {
    public static void main(String[] args) {
        String[] names = {"Mutinsakd","Chakn","Java8","Playlist","","",null};
        Predicate<String> nullOrEmpty = str -> str != null && str.length() != 0;
        ArrayList<String> filtered = new ArrayList<>();
        for (String str : names) {
            if (nullOrEmpty.test(str)) {
                //满足条件的添加到过滤数组中去
                filtered.add(str);
            }
        }
        //把空的去除掉了
        for (String str : filtered) System.out.println(str);
    }
}
