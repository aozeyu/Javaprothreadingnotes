package com.example.javaprothreadingnotes.lizi3;

public class Cookie {
  public Cookie() {
    // 先执行构造函数
    System.out.println("Cookie constructor");
  }
  protected void bite() {
    System.out.println("bite");
  }
}
