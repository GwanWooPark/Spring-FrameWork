package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest01 {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test01.xml");

        MyNickNamePrn myNick = (MyNickNamePrn) factory.getBean("myNickNamePrn");
        System.out.println(myNick);

    }
}
