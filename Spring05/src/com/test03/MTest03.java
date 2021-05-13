package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest03 {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("text03.xml");

        TV samsung = (TV) factory.getBean("samsung");
        TV lg = (TV) factory.getBean("lg");

        samsung.powerOn();
        lg.powerOff();
    }
}
