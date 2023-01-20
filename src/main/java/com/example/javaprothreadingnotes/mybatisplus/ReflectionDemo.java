package com.example.javaprothreadingnotes.mybatisplus;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Class c1 = Class.forName("com.example.javaprothreadingnotes.mybatisplus.User");
        Class c2 = Class.forName("com.example.javaprothreadingnotes.mybatisplus.User");
        Class c3 = Class.forName("com.example.javaprothreadingnotes.mybatisplus.User");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}
