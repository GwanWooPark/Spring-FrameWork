package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

    public static void main(String[] args) {

        // 모두한 박관우 호출
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Emp mo = (developer) factory.getBean("mo");
        Emp ahn = factory.getBean("ahn", Emp.class);


        System.out.println(mo);
        System.out.println(ahn);
    }
}
