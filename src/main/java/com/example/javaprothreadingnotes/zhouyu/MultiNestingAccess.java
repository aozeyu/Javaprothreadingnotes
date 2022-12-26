package com.example.javaprothreadingnotes.zhouyu;

public class MultiNestingAccess {
  public static void main(String[] args) {
    MNA mna = new MNA();
    MNA.A mnaa = mna.new A();
    MNA.A.B mnab = mnaa.new B();
    mnab.h();
  }
}
