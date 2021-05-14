package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest01 {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test01.xml");

        MessageBean Null = (MessageBean) factory.getBean("null");
        Null.sayHello();

        MessageBean apple = (MessageBean) factory.getBean("apple");
        apple.sayHello();

        MessageBean mango = (MessageBean) factory.getBean("mango");
        mango.sayHello();

        MessageBean banana = (MessageBean) factory.getBean("banana");
        banana.sayHello();
    }
}
