package com.example.javaprothreadingnotes.net;

public class StudentClass {
    private String name;
    private String email;

    public StudentClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
