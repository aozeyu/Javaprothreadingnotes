package com.example.javaprothreadingnotes.lizi3;

public class ChocolateChip2 extends Cookie{
  public ChocolateChip2() {
    System.out.println("ChocolateChip2 constructor");
  }
  public void chomp() {bite();} // 调用继承的Protected method方法

  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();
  }
}
