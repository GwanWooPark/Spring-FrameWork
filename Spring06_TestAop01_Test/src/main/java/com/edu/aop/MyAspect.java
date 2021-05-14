package com.edu.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("myClass()")
	public void before() {

		System.out.println("도형의 넓이를 구한다.");
	}

	@After("myClass()")
	public void after() {

		System.out.println("도형의 넓이를 출력한다.");
	}

	@Pointcut("execution(public * *(..))")
	public void myClass() {

	}
}
