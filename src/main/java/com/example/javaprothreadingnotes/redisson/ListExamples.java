package com.example.javaprothreadingnotes.redisson;


import org.redisson.Redisson;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;

public class ListExamples {
  public static void main(String[] args) {
    RedissonClient redisClient = Redisson.create();
    RList<String> nameList = redisClient.getList("nameList");
    nameList.clear();
    nameList.add("bingo");
    nameList.add("yanglbme");
    nameList.add("https://github.com/aozeyu");
    System.out.println(nameList);
    //移除最后一个元素
    nameList.remove(-1);
    System.out.println(nameList);
    boolean contains = nameList.contains("yanglbme");
    System.out.println(contains);
    System.out.println("List size: " + nameList.size());
    //打印每一个元素
    nameList.forEach(System.out::println);
  }
}
