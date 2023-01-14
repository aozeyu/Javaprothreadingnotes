package com.example.javaprothreadingnotes.Aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
    public void saveEmployee() {
        System.out.println("FROM SAVE EMPLOYEE");
    }
}
