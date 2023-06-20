package com.example.javaprothreadingnotes.Aop;

public class UUID {
  public static void main(String[] args) {
    String uuid = UUID.randomUUID().toString().replaceAll("-","");
  }

  private static Object randomUUID() {
  }
}
