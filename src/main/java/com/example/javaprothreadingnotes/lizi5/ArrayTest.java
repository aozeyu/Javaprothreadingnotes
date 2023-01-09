package com.example.javaprothreadingnotes.lizi5;

public class ArrayTest {
    public static void main(String[] args) {
        int [][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        System.out.println(a[0][0]);
        System.out.println("第一行的长度: " + a[0].length);
        System.out.println("第二行的长度: " + a[1].length);
        System.out.println("第三行的长度: " + a[2].length);

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                //a[0][0]
                System.out.println(a[i][j]);
            }
        }
    }
}
