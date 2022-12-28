package com.example.javaprothreadingnotes.lizi5;

public class CurrentThreadExp extends Thread{
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
  public static void main(String[] args) {
  CurrentThreadExp t1 = new CurrentThreadExp();
  CurrentThreadExp t2 = new CurrentThreadExp();
  t1.start();
  t2.start();
  }
}
