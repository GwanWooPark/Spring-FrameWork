package com.test07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        String methodName = invocation.getMethod().getName();

        StopWatch timer = new StopWatch();

        // before
        timer.start(methodName);
        System.out.println("[LOG] METHOD : " + methodName + " is Calling");

        //target
        Object obj = invocation.proceed();

        //after
        timer.stop();
        System.out.println("[LOG] METHOD : " + methodName + " was Called");
        System.out.println("[LOG] METHOD : " + timer.getTotalTimeSeconds() + " sec");

        return obj;
    }
}
