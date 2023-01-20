package com.example.javaprothreadingnotes.mybatisplus;

public class Person {
    public String name;
    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
