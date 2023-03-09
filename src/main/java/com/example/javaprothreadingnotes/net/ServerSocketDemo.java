package com.example.javaprothreadingnotes.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        BufferedReader bufferedReader = null;
        try {
            serverSocket= new ServerSocket(8080);
            // 一直等待直到客户端连接
            Socket accept = serverSocket.accept();
            //读数据
            bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            System.out.println(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }

            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}
