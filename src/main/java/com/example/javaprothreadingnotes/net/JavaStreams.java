package com.example.javaprothreadingnotes.net;

import java.io.IOException;
import java.util.Arrays;


public class JavaStreams {
    public static void main(String[] args) throws IOException {
        String[] names = {"Ai", "ANKIT", "SDSJK", "SORT"};
        //专成stream流
        //把S开头的选出来
        Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
    }
}
