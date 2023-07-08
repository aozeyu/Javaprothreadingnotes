package com.example.javaprothreadingnotes.Aop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class converTest {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    Object[] arr = list.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    String[] arr2 = {"a","b","c"};
    List<String> asList = Arrays.asList(arr2);
    for (int i = 0; i < asList.size(); i++) {
      System.out.println(asList.get(i));
    }
  }
}
