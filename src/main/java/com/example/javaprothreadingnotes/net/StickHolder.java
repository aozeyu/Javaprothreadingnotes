package com.example.javaprothreadingnotes.net;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class StickHolder {
    private static class Chopstick {

    }

    private BlockingDeque<Chopstick> holder = new ArrayBlockingQueue<>(1);
    private Chopstick stick = new Chopstick();

    private StickHolder() {
        putDown();
    }

    /*拿起筷子*/
    public void pickup() {
        try {
            holder.take(); // 不可用时会阻赛
        }catch (InterruptedException e) {
            throw  new RuntimeException();
        }
    }

    /*翻下筷子*/
    public void putDown() {
        try {
            holder.put(stick);
        }catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
