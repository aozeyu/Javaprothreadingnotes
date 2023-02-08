package com.example.javaprothreadingnotes.test2;

public class ChristmasTree {
  public static void main(String[] args) {
    int height = 10;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < height - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= 2 * i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < height - 1; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
