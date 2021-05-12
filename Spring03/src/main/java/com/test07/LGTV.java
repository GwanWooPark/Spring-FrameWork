package com.test07;

public class LGTV implements TV {

    public LGTV() {
        System.out.println("lg tv 생성!");
    }

    @Override
    public void powerOn() {
        System.out.println("lg tv power On");
    }

    @Override
    public void powerOff() {
        System.out.println("lg tv power Off");
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
