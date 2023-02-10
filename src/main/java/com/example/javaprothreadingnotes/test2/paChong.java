package com.example.javaprothreadingnotes.test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class paChong {
  public static void main(String[] args) throws IOException {
    String Net = "https://www.douyin.com/";
    // 2 爬取数据,把网址上的所有数据拼接成一个字符串
    String NetStr = wedCrawler(Net);
    System.out.println(NetStr);
  }
  public static String wedCrawler(String net) throws IOException {
    // 1 定义stringBuilder记录数据
    StringBuilder sb = new StringBuilder();
    // 2 创建一个URL对象
    URL url = new URL(net);
    // 3 链接上这个网址
    //要保证网络是畅通的，而且这个网址是可以链接上的
    URLConnection conn = url.openConnection();
    // 4 读取数据
    //将字节流转换为字符流
    InputStreamReader isr=new InputStreamReader(conn.getInputStream());
    int ch;
    while ((ch = isr.read()) != -1) {
      // 说明读得到字符添加到StringBuilder里面
      sb.append((char) ch);
    }
    isr.close();
    return sb.toString();
  }
}
