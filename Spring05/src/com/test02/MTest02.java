package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test02.xml");

        School mySchool = (School) factory.getBean("mySchool");
        System.out.println(mySchool);
    }
}
