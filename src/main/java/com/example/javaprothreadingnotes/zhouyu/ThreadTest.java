package com.example.javaprothreadingnotes.zhouyu;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(600);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }).start();
    }
}
