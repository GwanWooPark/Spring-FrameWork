package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Developer choi = factory.getBean("chois", Developer.class);
        Engineer hong = (Engineer) factory.getBean("hongs");

        System.out.println(choi);
        System.out.println(hong);
    }
}
