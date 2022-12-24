//package com.example.javaprothreadingnotes.lizi3;
//
//class Villain {
//  private String name;
//  protected void set(String nm) {
//    name = nm;
//  }
//  public Villain(String name) { this.name = name; )
//    public String toString() {
//      return "I'm a Villain and my name is " + name;
//    }
//  }
//}
//public class Orc extends Villain{
//  //The protected keyword.
//
//private int orcNumber;
//public Orc(String name, int orcNumber) {
//  //调用基类的构造函数
//  super(name);
//  this.orcNumber = orcNumber;
//}
//public void change(String name, int orcNumber) {
//  set(name); //调用基类的set方法
//  this.orcNumber = orcNumber;
//}
//public String toString() {
//  return  "Orc " + orcNumber + ":" + super.toString();
//}
//public static void main(String[] args){
//  //
//  Orc orc = new Orc("Limburger",12);
//  System.ou/**/t.println(orc);
//}
//}
