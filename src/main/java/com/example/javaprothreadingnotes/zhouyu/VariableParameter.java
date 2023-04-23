package com.example.javaprothreadingnotes.zhouyu;

public class VariableParameter {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
    static int add(int ...args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return  sum;
    }
}
