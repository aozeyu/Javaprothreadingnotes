package com.example.javaprothreadingnotes.Aop;

import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsumerDemo {
  public static void main(String[] args) {
    try {
      Runtime runtime = Runtime.getRuntime();
      Process process = runtime.exec("ipconfig");
      InputStream inputStream = process.getInputStream();
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"gbk");
      char[] c = new char[1024];
      int len = -1;
      while ((len = inputStreamReader.read(c)) != -1) {
        String s = new String(c,0,len);
        System.out.println(s);
      }
      inputStream.close();
      inputStreamReader.close();
      process.waitFor();
      int exitValue = process.exitValue();
      if (exitValue == 0) {
        System.out.println("进程正常结束");
      }else {
        System.out.println("进程异常结束");
      }
    }catch (Exception e){
        e.printStackTrace();
    }
  }
}
