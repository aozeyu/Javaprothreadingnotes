package com.example.javaprothreadingnotes.Jedis;

import java.util.function.Predicate;

public class DisplayName {
    public static void main(String[] args) {
        String[] names = {"Amrita","Pooja","Priya","Bobby","","",null};
        //断言条件,构造出一个条件已P开头
        Predicate<String> p = s -> s.charAt(0) == 'P';
        //循环出数组
        for (String str : names) {
            if (p.test(str)) {
                //当他满足条件的时候打印值
                //"Pooja","Priya"
                System.out.println(str);
            }
        }
    }
}
