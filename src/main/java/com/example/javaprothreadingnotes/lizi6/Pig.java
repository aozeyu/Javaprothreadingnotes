package com.example.javaprothreadingnotes.lizi6;

public class Pig implements Animal{
    //实现接口中定义的方法
    @Override
    public void animalSound() {
        //具体实现的东西在这里
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
