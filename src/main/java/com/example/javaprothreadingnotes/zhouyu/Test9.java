package com.example.javaprothreadingnotes.zhouyu;

import java.util.Optional;

public class Test9 {
  public static void main(String[] args) {
    Optional<String> str = Optional.of("www.w3cschool.cn");
    if (str.isPresent()) {
      String value = str.get();
      System.out.println("Optional contains " + value);
    }else {
      System.out.println("Optional is  empty.");
    }
  }
}
