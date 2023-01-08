package com.example.javaprothreadingnotes.lizi5;

import java.util.Arrays;
import java.util.List;

public class GFG {
    public static void main(String[] args) throws Exception{
        try {
            String a[] = new String[] {"A","B","C", "D"};
            System.out.println(a);
            List<String> list = Arrays.asList(a);
            System.out.println("The List is: " + list);
        }catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
