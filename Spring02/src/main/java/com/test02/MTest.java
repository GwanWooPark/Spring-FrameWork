package main.java.com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");

        Address me = (Address) factory.getBean("me");
        Address friend = (Address) factory.getBean("friend");


        System.out.println(me);
        System.out.println(friend);

    }
}
