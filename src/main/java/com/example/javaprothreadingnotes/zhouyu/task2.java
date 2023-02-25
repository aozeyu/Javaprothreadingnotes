package com.example.javaprothreadingnotes.zhouyu;

public class task2 {
  public static void main(String[] args) {
    String str = "1 2 1 2 -1 1 3 1 3 -1 0";
    String[] mas = str.split(" "); // 以空格分隔成数组

    int sum = 0;
    //循环数组
    for (int i = 0; i < mas.length - 1 ; i ++ ) {
      int next_el = Integer.parseInt(mas[i+1]);
      if (next_el < 0 ) {
        int curr_element = Integer.parseInt(mas[i]);
        sum += curr_element;
      }
    }

    System.out.println(sum);

  }
}
