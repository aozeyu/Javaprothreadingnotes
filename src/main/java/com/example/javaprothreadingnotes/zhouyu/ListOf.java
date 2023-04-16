package com.example.javaprothreadingnotes.zhouyu;


import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        // 创建一个包含多个元素的不可变List
        List<String> list = List.of("苹果", "香蕉", "橙子", "草莓");
        System.out.println(list);
    }
}
