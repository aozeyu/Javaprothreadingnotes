package com.example.javaprothreadingnotes.Aop;


public class MainThread {
    public static void main(String[] args) {
        DownThread downThread = new DownThread();
        downThread.start();
        SecDownThread secDownThread = new SecDownThread();
        Thread thread = new Thread(secDownThread);
        thread.start();
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {

            }
            System.out.printf("Main - %d\n", i);
        }
    }
}
