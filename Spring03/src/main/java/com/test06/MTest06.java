package com.test06;

public class MTest06 {

    public static void main(String[] args) {

        BeanFactory factory = new BeanFactory();
        TV tv = (TV) factory.getBean("samsung");

        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
    }
}
