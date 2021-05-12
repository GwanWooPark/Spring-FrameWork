package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MTest01 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Date start = factory.getBean("start", Date.class);
        System.out.println(start);

        BeanTest bean = (BeanTest) factory.getBean("beanTest");

    }
}
