package com.example.javaprothreadingnotes.zhouyu;

import org.apache.commons.collections.comparators.ReverseComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseComparatorDemo {
  public static void main(String[] args) {
    Integer array[] = {10,2,4,3,6,1,7,8,0,9};
    List<Integer> list = Arrays.asList(array);
    Collections.sort(list,new ReverseComparator());

  }
}
