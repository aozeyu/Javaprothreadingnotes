package com.example.javaprothreadingnotes.net;

import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {
    private final int seat;
    private final StickHolder left, right;

    public Philosopher(int seat, StickHolder left, StickHolder right) {
        this.seat = seat;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            right.pickup();
            waitTime(100); // 等待一会儿，让所有的哲学家都能拿起右手边的筷子，然后在尝试获取左手边的筷子时形成循环等待
            left.pickup();
            right.putDown();
            left.putDown();
            System.out.println(this + " eating");
        }

    }

    private void waitTime(long duration) {
        try {
            TimeUnit.MICROSECONDS.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
