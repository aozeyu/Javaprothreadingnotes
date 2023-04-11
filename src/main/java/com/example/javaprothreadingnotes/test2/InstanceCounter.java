package com.example.javaprothreadingnotes.test2;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances ++ ;
    }

    InstanceCounter() {
        //构造函数实例化对象的时候会被调用 使的 numInstances 变量 +1
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        //初始化为0
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}
