package com.example.javaprothreadingnotes.zhouyu;

public interface ClassInInterface {
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy !");
    }
    public static void main(String[] args){
      new Test().howdy();
    }
  }
}
