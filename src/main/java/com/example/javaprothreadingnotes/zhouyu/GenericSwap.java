package com.example.javaprothreadingnotes.zhouyu;

import java.util.Arrays;

public class GenericSwap {
    public static void main(String[] args) {
        String[] arr = {"abc","xyz","qinxiaohui"};
        //交换arr 后面两个 变量
        swap(arr,1,2);
        System.out.println(Arrays.asList(arr));
    }
    static <T> void swap(T[] arr,int i,int j) {
        T tem = arr[i];
        //交换
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
