package com.example.javaprothreadingnotes.net;

import java.lang.reflect.Field;

public class MyClass {
    private int myField = 123;

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        MyClass obj = new MyClass();
        Class<?> clazz = obj.getClass();
        Field field = clazz.getDeclaredField("myField");
        field.setAccessible(true);
        int fieldValue = (int) field.get(obj);
        System.out.println("myFiled = " + fieldValue);
        field.set(obj,456);
        System.out.println("myFiled =  " + obj.myField);
    }
}
