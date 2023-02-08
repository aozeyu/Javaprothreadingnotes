package com.example.javaprothreadingnotes.test2;

public class AutoBoxingDemo {
  public static void main(String[] args) {
    int i = 10;
    Integer iObj = Integer.valueOf(i);
    //装箱
    System.out.println(iObj);
    int i1 = iObj;
    //开箱
    System.out.println(i1);
  }

  public static String  bugfix() {
    //这个是从master分支合并过来的
     return "bugfix from main";
  }
}
