package com.example.javaprothreadingnotes.redisson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonTester {
  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      Student student = new Student(1, null);
      //将对象转成字符串
      String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
      System.out.println(jsonString);
      int i = (int) 5.6;
      System.out.println(i);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
