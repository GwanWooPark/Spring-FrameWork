package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest05 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test05.xml");

        Developer choi = factory.getBean("chois", Developer.class);
        Engineer hong = (Engineer) factory.getBean("hongs");

        System.out.println(choi);
        System.out.println(hong);
    }
}
