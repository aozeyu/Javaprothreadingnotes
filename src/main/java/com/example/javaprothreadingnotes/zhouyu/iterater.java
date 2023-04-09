package com.example.javaprothreadingnotes.zhouyu;

import java.util.ArrayList;
import java.util.Iterator;

public class iterater {
  public static void main(String[] args) {
    ArrayList<String> cars  = new ArrayList<String>();
    cars.add("Volo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Marza");
    Iterator<String> it = cars.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
