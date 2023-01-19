package com.example.javaprothreadingnotes.Enum;

public class EnumTest {
  public static void main(String[] args) {
    DaysofTheWeek day = DaysofTheWeek.tuesday;
    System.out.println(day);

    if (day.equals(DaysofTheWeek.tuesday)) {
      System.out.println("Yes ok");
    }
    System.out.println("-------------");
    //循环值
    for (DaysofTheWeek day2 : DaysofTheWeek.values()) {
      System.out.println(day2);
    }
  }
}
