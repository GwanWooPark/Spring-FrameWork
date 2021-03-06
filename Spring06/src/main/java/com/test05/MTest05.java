package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest05 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test05.xml");

        Person m = factory.getBean("man", Person.class);
        Person w = factory.getBean("woman", Person.class);

        System.out.println("남학생 입장");
        m.classWork();
        System.out.println("-------");
        System.out.println("여학생 입장");
        w.classWork();
    }
}
