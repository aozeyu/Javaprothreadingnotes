package com.example.javaprothreadingnotes.test2;

public class Demo02MethodOverloadSame {
  public static void main(String[] args) {
    //成员变量
    byte a = 10;
    byte b = 20;
    //方法重载 参数类型不同名字一样其实是不一样的作用
    System.out.println(isSame(a, b));
    System.out.println(isSame(10,20));
    System.out.println(isSame((short) 20,(short) 20));
    System.out.println(isSame(11,12));
  }

  //行参
  public static boolean isSame(byte a, byte b) {
    System.out.println("两个byte参数");
    boolean same;
    if (a == b) {
      same = true;
    } else {
      same = false;
    }
    return same;
  }

  public static boolean isSame(short a, short b) {
    System.out.println("两个short参数");
    return a == b;
  }

  public static boolean isSame(int a, int b) {
    System.out.println("两个int参数");
    return a == b;
  }

  public static boolean isSame(long a, long b) {
    System.out.println("两个long参数");
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }
}
