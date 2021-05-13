package com.test03;

import org.springframework.stereotype.Component;

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
