package com.example.javaprothreadingnotes.zhouyu;

public class Test2 {
  public static void main(String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();

    Thread.sleep(2000);

    System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
  }
}
