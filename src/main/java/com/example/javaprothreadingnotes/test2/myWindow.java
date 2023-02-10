package com.example.javaprothreadingnotes.test2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class myWindow extends Thread{
  //static 表示这个类所有的对象，都共享ticket数据
  static int ticket = 0; //0~99

  static Lock lock = new ReentrantLock();
  //创建的锁对象一定要是唯一的
  //static Object obj=new Object();
  @Override
  public void run() {
    while (true) {
      //同步代码块
      //synchronized (myWindow.class){
      lock.lock();//上锁
      try {
        if (ticket < 100) {
          ticket++;
          Thread.sleep(1);
          System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
        } else {
          System.out.println("票已售空");
          break;
        }
      }catch (InterruptedException e){
        e.printStackTrace();
      }finally {
        lock.unlock();
      }
      //}
    }
  }
}
