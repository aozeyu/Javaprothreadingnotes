package com.example.javaprothreadingnotes.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

    @Pointcut("execution(public void com.example.javaprothreadingnotes.Aop.EmployeeDao.saveEmployee())")
    public void p1(){

    }
    @Before("p1()")
    public  void  beginTx() {
        System.out.println("Tx Started");
    }

    @After("p1()")
    public void commitTx() {
        System.out.println("Tx Commited");
    }
}
