package com.example.javaprothreadingnotes.lizi2;

//然而，可变参数列表与自动包装机制可以和谐共处
public class AutoboxingVarargs {
  public static void f(Integer... args) {
    for (Integer i: args) {
      System.out.print(i + " ");
    }
    //for循环结束后换行
    System.out.println();
  }
  public static void main(String[] args) {
    f(new Integer(1), new Integer(2));
    f(4 ,5, 6, 7,8, 9);
    f(10, new Integer(11), 12);
  }
}
