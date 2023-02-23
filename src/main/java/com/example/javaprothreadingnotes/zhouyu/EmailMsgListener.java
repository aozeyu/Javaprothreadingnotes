package com.example.javaprothreadingnotes.zhouyu;

public class EmailMsgListener implements EventListener {
  private final String email;

  public EmailMsgListener(String email) {
    this.email = email;
  }

  @Override
  public void update() {
    // 实际去发邮件
  }
}
