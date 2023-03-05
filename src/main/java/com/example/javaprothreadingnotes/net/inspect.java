package com.example.javaprothreadingnotes.net;

import java.util.List;

public class inspect {
    public void inspect(List<Object> list) {
        //循环
        for (Object obj : list) {
            System.out.println(obj);
        }
        //这个操作在当前方法的上下文是合法的。
        list.add(1);

    }
}
