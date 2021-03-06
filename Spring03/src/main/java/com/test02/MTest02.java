package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

    public static void main(String[] args) {
        // 등록된 bean 모두 출력
        ApplicationContext factory = new ClassPathXmlApplicationContext("test02.xml");

        Emp lee = (Emp) factory.getBean("lee");
        Emp park = (Emp) factory.getBean("park");

        System.out.println(lee);
        System.out.println(park);
    }
}
