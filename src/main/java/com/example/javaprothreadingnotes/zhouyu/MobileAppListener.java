package com.example.javaprothreadingnotes.zhouyu;

public class MobileAppListener implements EventListener{
  private final String username;

  //有参构造函数
  public MobileAppListener(String username) {
    //this 指向当前类
    this.username = username;
  }

  @Override
  public void update() {

  }
}
