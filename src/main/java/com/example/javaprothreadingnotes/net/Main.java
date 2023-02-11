package com.example.javaprothreadingnotes.net;

public class Main {
    public static void main(String[] args) {
        Outer myOuter = new Outer();
        //是梨花内部类
        Outer.Inner myInner = myOuter.new Inner();
        System.out.println(myOuter.x - myInner.y);
    }
}
