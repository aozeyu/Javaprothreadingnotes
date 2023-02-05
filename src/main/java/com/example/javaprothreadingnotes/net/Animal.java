package com.example.javaprothreadingnotes.net;

public class Animal {
    protected  String name;
    public Animal(String newName) {
        name = newName;
    }
    public void noise() {
        System.out.println("This name makes a noise!");
    }
    public String toString() {
        return "This is a(n) " + name;
    }
}
