package com.example.javaprothreadingnotes.mybatisplus;

public class ClassCreateDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Student();
        System.out.println(person.name);
        // 方式1：通过对象获得转载请注明来源
        Class c1 = person.getClass();
        System.out.println("c1: " + c1.hashCode());
        Class c2 = Class.forName("com.example.javaprothreadingnotes.mybatisplus.Student");
        System.out.println(c2);

        Class c3 = Student.class;
        System.out.println("c3: " + c3.hashCode());
        Class c4 = Integer.TYPE;
        System.out.println(c4.getName());
        //获取父类类型转载请注明来源
        Class c5 = c1.getSuperclass();
        //父类为Person类
        System.out.println(c5);
    }
}
