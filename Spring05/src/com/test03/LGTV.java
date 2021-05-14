package com.test03;

import org.springframework.stereotype.Component;


// <bean id="lgTV" class="com.test03.LGTV"/>
@Component
public class LGTV implements TV{

    @Override
    public void powerOn() {
        System.out.println("lg tv power on");
    }

    @Override
    public void powerOff() {
        System.out.println("lg tv power off");
    }

    @Override
    public void volumeUp() {
        System.out.println("lg tv volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("lg tv volume Down");
    }
}
