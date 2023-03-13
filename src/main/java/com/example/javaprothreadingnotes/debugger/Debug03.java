package com.example.javaprothreadingnotes.debugger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Debug03 {
  public static boolean isDate(String dateStr) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date date = dateFormat.parse(dateStr);
      //是日期类型则返回true
      return dateStr.equals(dateFormat.format(date));
    } catch (Exception e) {
      //不是日期就返回false
      return false;
    }
  }

  public static void main(String[] args) {
    String dateString = "2023-03-13";
    String replace = dateString.replace("-", "");
    System.out.println(replace);
    boolean isDate = isDate(dateString);
    System.out.println("Is " + dateString + " a date? " + isDate);
  }
}
