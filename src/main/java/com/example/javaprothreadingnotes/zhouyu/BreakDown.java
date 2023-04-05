package com.example.javaprothreadingnotes.zhouyu;

public class BreakDown {
    public static void main(String[] args) {
       int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                // 30的时候跳出整个for循环
                break;
            }
            System.out.println(numbers[i]);
        }
    }
}
