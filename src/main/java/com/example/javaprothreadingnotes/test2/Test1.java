package com.example.javaprothreadingnotes.test2;

public class Test1 {
  public static void main(String[] args) {
    /**
     * 需求
     * 某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票
     */
    myWindow w1 = new myWindow();
    myWindow w2 = new myWindow();
    myWindow w3 = new myWindow();
    w1.setName("窗口1");
    w2.setName("窗口2");
    w3.setName("窗口3");
    w1.start();
    w2.start();
    w3.start();
  }
}
