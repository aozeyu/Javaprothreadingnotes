package com.example.javaprothreadingnotes.lizi5;

import java.util.Arrays;
import java.util.List;

public class GFG2 {
    public static void main(String[] args) throws Exception{
        try {
            Integer a[] = new Integer[] {10,20,30,40};
            List<Integer> list = Arrays.asList(a);
            list.add(50);
            System.out.println("The List is: " + list);
        }catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
