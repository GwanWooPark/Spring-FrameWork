package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MTest02 {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("test02.xml");

        MemberInfo member = (MemberInfo) factory.getBean("member");

        int num = (int) (Math.random() * 2);

        if (num == 0) {
            String msg = factory.getMessage("title", null, "기본 메세지", Locale.getDefault());
            System.out.println(msg);
            member.display(Locale.getDefault());
        } else {
            String msg = factory.getMessage("title", null, "기본 메세지", Locale.KOREA);
            System.out.println(msg);
            member.display(Locale.KOREA);
        }
    }
}
