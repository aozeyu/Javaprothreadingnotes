package com.example.javaprothreadingnotes.Aop;

import java.util.ArrayList;

public class TestDebugger2 {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("1");
    strings.add("2");
    strings.add("3");
    strings.add("abc");
    strings.stream().forEach(str -> {
      String a = str;
      System.out.println(a);
    });
  }
}
