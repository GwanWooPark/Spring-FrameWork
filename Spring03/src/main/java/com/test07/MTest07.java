package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest07 {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test07.xml");

        TV lg = (TV) factory.getBean("lg");
        //SamsungTV sam = factory.getBean("samsung", SamsungTV.class);

        lg.powerOn();
        lg.powerOff();
        lg.volumeDown();
        lg.volumeUp();
    }
}
