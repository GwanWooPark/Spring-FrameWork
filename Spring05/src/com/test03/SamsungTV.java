package com.test03;

import org.springframework.stereotype.Component;

// <bean id="samsung" class="com.test03.SamsungTV"/>
@Component("samsung")
public class SamsungTV implements TV{

    @Override
    public void powerOn() {
        System.out.println("samsung tv power on");
    }

    @Override
    public void powerOff() {
        System.out.println("samsung tv power off");
    }

    @Override
    public void volumeUp() {
        System.out.println("samsung tv volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("samsung tv volume Down");
    }
}
