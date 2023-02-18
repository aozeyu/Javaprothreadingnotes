package com.example.javaprothreadingnotes.zhouyu;

public class Arithmetic {
  public static void main(String[] args) {
    int x = 3;
    int y = 0;
    double z = 0;
    try {
      z = x/y;
    }catch (ArithmeticException e) {
      //catch住错误
      e.printStackTrace();
    }
    //继续执行
    System.out.printf("x = %d,y = %d, z = %S%n",x,y,z);
  }
}
