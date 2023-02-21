package com.example.javaprothreadingnotes.zhouyu;

public class String101 {
  public static void main(String[] args) {
    String word = "Barefoot";
    //截取0, 1,2 不包括3   打印 Bar
    String sub1 = word.substring(0, 3);
    //截取0, 1,2,3不包括4  打印 Bare
    String sub2 = word.substring(0, 4);

    //从4一直截取到末尾
    String sub3 = word.substring(4);
    char sub4 = word.charAt(4);
    System.out.println(sub1);
    System.out.println(sub2);
    System.out.println(sub3);
    System.out.println(sub4);
  }
}
