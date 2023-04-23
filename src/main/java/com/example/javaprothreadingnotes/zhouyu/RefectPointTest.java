package com.example.javaprothreadingnotes.zhouyu;

import java.lang.reflect.Field;

public class RefectPointTest {
    public static void main(String[] args) throws Exception{
        RefectPoint point = new RefectPoint(3,5);
        Class<? extends RefectPoint> pointClass = point.getClass();
        Field fieldY = pointClass.getField("y");
        //得到y值
        System.out.println(fieldY.get(point));
    }
}
