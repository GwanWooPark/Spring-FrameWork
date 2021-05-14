package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Before("execution(public * *(..))")
    public void before(JoinPoint join) {
        System.out.println("출석 카드 찍음");
    }

    @AfterThrowing("execution(public * *(..))")
    public void throwing(JoinPoint join) {
        System.out.println("쉬는 날 이였음");
    }

    @AfterReturning(pointcut = "execution(public * *(..))", returning = "returnVal")
    public void returning(JoinPoint join, Object returnVal) {
        System.out.println(returnVal + "공부하는 날이였음");
   }

   @After("execution(public * *(..))")
    public void after(JoinPoint join) {
        System.out.println("집에 간다.");
    }
}
