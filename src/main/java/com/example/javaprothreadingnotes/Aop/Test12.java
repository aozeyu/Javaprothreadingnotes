package com.example.javaprothreadingnotes.Aop;

import java.util.ArrayList;

public class Test12 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        try {
            for (String elem : args) {
                listInt.add(Integer.parseInt(elem));
            }
            String name2 = "      Rekja       ";
            System.out.println(name2.trim());
            System.out.println(listInt);
        }catch (Exception e) {
            System.out.println("Wrong arguments");
        }
    }
}
