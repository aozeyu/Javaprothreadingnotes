package com.example.javaprothreadingnotes.Enum;

public enum Cereals {
  red(50),
  green(100),
  blue(110);
  int levelOf;
  //每一个枚举值都需要一个参数
  Cereals(int levelOf) {
    this.levelOf = levelOf;
  }
}
