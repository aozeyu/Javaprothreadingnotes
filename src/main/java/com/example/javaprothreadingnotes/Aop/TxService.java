package com.example.javaprothreadingnotes.Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxService {

    @Pointcut("execution(public void com.example.javaprothreadingnotes.Aop.EmployeeDao.saveEmployee")
    public void p1(){

    }
    @Before("p1()")
    public  void  beginTx() {
        System.out.println("Tx Started");
    }
}
