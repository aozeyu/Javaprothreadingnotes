package com.example.javaprothreadingnotes.lizi4;


import java.io.File;

public class Demo {
  public static void main(String[] args){
    //
    File[] roots = File.listRoots();
    for (File root : roots) {
      System.out.println(root);
    }
  }
}
