package com.example.javaprothreadingnotes.test2;

import java.util.Collection;

public class Test2 {
  void printObject(Object obj) {
    if (obj instanceof String s) {
      System.out.println("String: \"" + s + "\"");
    }else if (obj instanceof Collection<?> c) {
      System.out.println("Collection (size = " + c.size() + ")");
    }else {
      System.out.println("Other object: " + obj);
    }
  }
}
