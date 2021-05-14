package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest06 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test06.xml");

        Person w = factory.getBean("woman", Person.class);
        Person m = factory.getBean("man", Person.class);

        System.out.println("girl");
        w.classWork();
        System.out.println("-----");
        System.out.println("man");
        m.classWork();
    }
}
