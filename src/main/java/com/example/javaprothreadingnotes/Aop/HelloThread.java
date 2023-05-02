package com.example.javaprothreadingnotes.Aop;

public class HelloThread extends Thread{

    @Override
    public void run() {
        System.out.println("hello Thread");
    }


    public static void main(String[] args) {
        HelloThread th = new HelloThread();
        th.setName("测试线程名称");
        th.start();
        System.out.println(th.getName());
    }
}
