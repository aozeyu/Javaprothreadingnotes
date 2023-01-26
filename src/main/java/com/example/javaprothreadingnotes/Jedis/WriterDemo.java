package com.example.javaprothreadingnotes.Jedis;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        String s = "Hello World";
        Writer writer = new PrintWriter(System.out);
        try {
            writer.append(s);
            writer.flush();
            writer.append("" +
                    "This is an example");
            writer.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
