package com.example.javaprothreadingnotes.zhouyu;

class Calc {
  int num1;
  int num2;
  int result;
  public Calc() {
      num1 = 5;
      num2 = 5;
    System.out.println("in constructor");
  }

}

public class ObjectDemo {
  public static void main(String[] args) {
    //调用构造函数
    //调用构造函数
    Calc obj = new Calc();
    System.out.println(obj.num1);
  }
}
