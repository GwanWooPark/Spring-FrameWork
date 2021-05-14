package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest03 {

    public static void main(String[] args) {

        // 모두한 안재웅 호출
        ApplicationContext factory = new ClassPathXmlApplicationContext("test03.xml");

        Emp mo = (developer) factory.getBean("mo");
        Emp ahn = factory.getBean("ahn", Engineer.class);


        System.out.println(mo);
        System.out.println(ahn);
    }
}
