package com.example.javaprothreadingnotes.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataTest {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        //过滤出偶数的
        List<Integer> collect = objects.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
