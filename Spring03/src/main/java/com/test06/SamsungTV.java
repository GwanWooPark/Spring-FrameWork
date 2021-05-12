package com.test06;

public class SamsungTV implements TV {


    @Override
    public void powerOn() {
        System.out.println("samsung tv power On");
    }

    @Override
    public void powerOff() {
        System.out.println("samsung tv power Off");
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
