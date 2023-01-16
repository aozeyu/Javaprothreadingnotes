package com.example.javaprothreadingnotes.redisson;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonInclude用于排除具有 null/empty 或默认值的属性。

public class Student {
  public int id;
  public String name;

  Student(int id,String name){
    this.id = id;
    this.name = name;
  }
}
