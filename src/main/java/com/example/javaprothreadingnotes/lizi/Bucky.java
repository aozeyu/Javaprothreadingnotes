package com.example.javaprothreadingnotes.lizi;

import java.util.LinkedList;
import java.util.List;

public class Bucky {
  public static void main(String[] args) {
    String[] things = {"apples","noobs","pwnge","bacon","goATS"};
    List<String> list1 = new LinkedList<String>();
    for(String x : things) {
      list1.add(x);
      String[] things2 = {"sausage","bacon","goats","harrypotter"};
      List<String> list2 = new LinkedList<String>();
      for (String y : things2) {
        list2.add(y);
        //拼接list，在list1上加上list2
        list1.addAll(list2);
        list2 = null;
        printMe(list1);
      }
    }
  }

  private static void printMe(List<String> list1) {
    System.out.println("spring IOC");
  }
}
