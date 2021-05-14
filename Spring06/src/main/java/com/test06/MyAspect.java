package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(public * *(..))")
    public void before() {
        System.out.println("check card");
    }

    @After("myClass()")
    public void after() {
        System.out.println("go home");
    }

    @Pointcut("execution(public * *(..))")
    public void myClass() {
        // if you want use
    }
}
