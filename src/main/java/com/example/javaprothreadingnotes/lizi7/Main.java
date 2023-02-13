package com.example.javaprothreadingnotes.lizi7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.getMakeString();
        String make = car.getMake();
        System.out.println(make);
        car.topSpeed(200);
    }

}
