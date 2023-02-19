package com.example.javaprothreadingnotes.net;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);
    }
    public static void increment(int x) {
        //局部变量
        x ++;
        //x == 2
        System.out.println(x);
    }
}
