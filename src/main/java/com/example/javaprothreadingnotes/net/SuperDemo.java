package com.example.javaprothreadingnotes.net;

class A {
 public A() {
     System.out.println("in A");
 }
 public A(int i) {
     System.out.println("in A int");
 }
}

class B extends A{
    public B() {
        super(); // 不写的话由于继承了A所以会默认写在这里
        System.out.println("in B");
    }

    public B(int i) {
        super(i); // 调用A的有参数构造,这个需要手动写上去
        System.out.println("in B int");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        // new A的时候A的构造函数会被调用
        //由于B 继承了A 所以new B 会调用 A和B的构造函数
        //传了参数就会调用B的有参构造
//        B obj1 = new B(5);
        B obj1 = new B();

    }
}
