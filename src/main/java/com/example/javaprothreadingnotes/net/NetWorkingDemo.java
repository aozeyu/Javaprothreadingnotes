package com.example.javaprothreadingnotes.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetWorkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url = "front.yaozeyu.com";
        InetAddress inetAddress = InetAddress.getByName(url);
        //转成字符串
        System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));
        //服务器地址: 47.111.131.185
        System.out.println("Host Address " + inetAddress.getHostAddress());
        System.out.println("isAnyLocalAddress: " + inetAddress.isAnyLocalAddress());
        System.out.println("isLinkLocalAddress: " + inetAddress.isLinkLocalAddress());

    }
}
