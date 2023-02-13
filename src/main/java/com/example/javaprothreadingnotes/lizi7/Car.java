package com.example.javaprothreadingnotes.lizi7;

public class Car {
    String make = "BMW";
    public void getMakeString() {
        System.out.println("The car make is " + make);
    }
    public String getMake() {
        return make;
    }
    public void topSpeed(int speed) {
        System.out.println("The current speed is: " + speed);
    }
}
