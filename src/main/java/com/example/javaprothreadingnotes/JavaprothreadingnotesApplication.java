package com.example.javaprothreadingnotes;

import com.example.javaprothreadingnotes.stream.Employee;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
@EnableAspectJAutoProxy
@MapperScan("com.example.javaprothreadingnotes.mapper")
public class JavaprothreadingnotesApplication implements CommandLineRunner {

    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(JavaprothreadingnotesApplication.class, args);
    }

    // 启动后自动执行
    @Override
    public void run(String... args) throws Exception {
        System.out.println("running...");
    }
}
