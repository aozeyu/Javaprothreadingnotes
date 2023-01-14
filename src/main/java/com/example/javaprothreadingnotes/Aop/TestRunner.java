package com.example.javaprothreadingnotes.Aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {
    @Autowired
    private EmployeeDao dao;
    @Override
    public void run(String... args) throws Exception {
        dao.saveEmployee();
    }
}
