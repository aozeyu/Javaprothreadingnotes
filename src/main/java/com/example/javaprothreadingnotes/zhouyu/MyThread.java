package com.example.javaprothreadingnotes.zhouyu;

public class MyThread extends Thread {
  private int id;

  public MyThread() {
  }

  @Override
  public void run() {
    System.out.println("Hello from " + this);
  }

  @Override
  public String toString() {
    return String.format("MyThread{id=%d}", id);
  }
}
