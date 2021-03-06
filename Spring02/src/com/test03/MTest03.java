package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest03 {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test03.xml");

        Address lee = (Address) factory.getBean("lee");
        Address park = (Address) factory.getBean("park");

        System.out.println(lee);
        System.out.println(park);
    }
}
