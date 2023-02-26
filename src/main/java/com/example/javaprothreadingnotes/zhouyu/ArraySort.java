package com.example.javaprothreadingnotes.zhouyu;

import java.util.Arrays;

public class ArraySort {
  public static void main(String[] args) {
    int[] ints1 = new int[]{4,3,5};
    int[] inst2 = new int[]{7,9,3,2,1};
    Arrays.sort(ints1);
    //排序
    for (int i : ints1) {
      System.out.println(i + " ");
    }
    System.out.println();

    int temp = 0;
    for (int i = 0; i< inst2.length; i ++) {
      for (int j =0 ; j < inst2.length; j++) {
        if (inst2[i] < inst2[j]) {
          //交换换位顺序
          temp = inst2[j];
          inst2[j] = inst2[i];
          inst2[i] = temp;
        }
      }
    }

    for (int i: inst2) {
      System.out.println(i + " ");
    }
  }
}
