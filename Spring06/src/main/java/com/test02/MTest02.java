package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test02.xml");

        Person m = (Person) factory.getBean("man");
        Person w = (Person) factory.getBean("woman");

        System.out.println("님힉생 입장");
        m.classWork();
        System.out.println("---------");
        System.out.println("여학생 입장");
        w.classWork();
    }
}
