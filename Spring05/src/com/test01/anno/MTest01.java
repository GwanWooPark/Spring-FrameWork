package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest01 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");

        MyNickNamePrn myNick = (MyNickNamePrn) factory.getBean("myNickNamePrn");
        System.out.println(myNick);
    }
}
