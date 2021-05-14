package com.test04.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("testanno04.xml");

        Developer baek = (Developer) factory.getBean("baeks");
        Engineer hong = factory.getBean("honggd", Engineer.class);

        System.out.println(baek);
        System.out.println(hong);
    }
}
