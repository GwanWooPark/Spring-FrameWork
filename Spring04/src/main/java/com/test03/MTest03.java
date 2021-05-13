package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest03 {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test03.xml");
        // spring container - 얘가 생성이 되면 xml안에 bean에서 설정한 객체들이 생성이 된다.


        MyFood my = factory.getBean("myFood", MyFood.class);
        System.out.println(my);
    }
}
