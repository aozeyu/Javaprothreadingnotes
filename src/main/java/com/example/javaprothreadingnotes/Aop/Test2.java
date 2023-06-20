package com.example.javaprothreadingnotes.Aop;

public class Test2 {
  static boolean flag = false;
  static Object object = new Object();

  public static void main(String[] args) {
    new Thread(() -> {
      synchronized (object) {
        while (!flag) {
          try {
            object.wait();
            System.out.println("a");
          }catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });
    new Thread(() -> {
      synchronized (object) {
        System.out.println("b");
        //设置变量
        flag = true;
        //唤醒等待的线程打印a
        object.notifyAll();
      }
    });
  }
}
