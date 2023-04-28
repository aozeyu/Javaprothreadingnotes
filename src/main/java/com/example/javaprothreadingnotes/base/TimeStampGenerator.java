package com.example.javaprothreadingnotes.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TimeStampGenerator {
    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String randomNum = String.valueOf(new Random().nextInt(900) + 100);
        String finalTimeStamp = timeStamp + randomNum;
        System.out.println(finalTimeStamp);
    }
}
