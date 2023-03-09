package com.example.javaprothreadingnotes.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocketDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",8080);
            System.out.println(socket);
            //自动刷新
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            // 向服务器发送字符串"hello"。
            printWriter.println("hello123213");
        }catch (Exception e) {

        }finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
