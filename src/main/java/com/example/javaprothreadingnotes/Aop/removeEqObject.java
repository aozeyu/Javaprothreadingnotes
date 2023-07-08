package com.example.javaprothreadingnotes.Aop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeEqObject {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("8");
    list.add("8");
    list.add("9");
    list.add("9");
    list.add("0");
    System.out.println(list);
    //将list中数据取出来存到Set中
    HashSet<String> set = new HashSet<String>();
    set.addAll(list);
    System.out.println(set);
  }
}
