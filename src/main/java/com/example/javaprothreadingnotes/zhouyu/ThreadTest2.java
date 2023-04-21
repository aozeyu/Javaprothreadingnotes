package com.example.javaprothreadingnotes.zhouyu;

public class ThreadTest2 {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(1600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }).run();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }).run();
    }

}
