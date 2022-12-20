package com.example.javaprothreadingnotes.lizi3;



class Art{
  Art() {
    //new Art就会执行
    System.out.println("Art constructor");
  }
}

class Drawing extends Art {
  Drawing() {
    System.out.println("Drawing constructor");
  }
}
public class Cartoon extends Drawing{
  public Cartoon() {
    System.out.println("Cartoon constructor");
  }
  public static void main(String[] args){
    //构建过程是从基类 “向外” 扩散的
    Cartoon x = new Cartoon();
  }
}
