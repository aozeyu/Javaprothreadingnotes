package com.example.javaprothreadingnotes.Aop;

public class TestDebugger {
  public static void main(String[] args) {
    methodA();
  }
  private static void methodA() {
    methodB();

  }
  private static void methodB() {
    System.out.println("213213");
  }
}
