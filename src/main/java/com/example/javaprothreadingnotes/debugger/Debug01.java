package com.example.javaprothreadingnotes.debugger;

public class Debug01 {
  public static void main(String[] args) {
    int m = 10;
    int n = 20;
    System.out.println("m = " + m + ", n = " + n);
    //交换数字
    swap(m,n);
    System.out.println("m = " + m + ",n = " + n);
  }

  public static void swap(int m, int n) {
    //只是局部变量交换了，main中没有变
   int temp = m;
    m = n;
    n = temp;
    System.out.println("m = " + m + ",n = " + n);
  }
}
