package com.example.javaprothreadingnotes.net;

public class Dog extends Animal{

    public Dog(String newName) {
        super(newName);
    }

    public String getName() {
        //子类访问不到父类的private属性因为是私有但可以访问protected
        return name;
    }
}
