package com.test01;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

public class MyAdvice {


    public void beforeSaying() {
        System.out.println("이름이 뭐니?");
    }

    public void afterReturnSaying() {
        System.out.println("이름 멋지네");
    }


    public void afterSaying() {
        System.out.println("직업이 뭐니?");
    }

}
