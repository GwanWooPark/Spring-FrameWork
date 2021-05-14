package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test02.xml");

        Address me = (Address) factory.getBean("me");
        Address friend = (Address) factory.getBean("friend");

        System.out.println(me);
        System.out.println(friend);

    }
}
