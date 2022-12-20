package com.example.javaprothreadingnotes.lizi3;


class Game {
  Game(int i) {
    System.out.println("Game Constructor");
  }
}

class BoardGame extends Game{
  BoardGame(int i) {
    //调用基类的构造函数(有参数)
    //第一件事就是先super关键字调用积累的有灿构造含糊
    super(i);
    System.out.println("BoardGame  Constructor");
  }
}
public class Chess extends BoardGame{

  Chess() {
    super(11);
    System.out.println("Chess Constructor");
  }
  public static void main(String[] args){
    Chess x = new Chess();
  }
}
