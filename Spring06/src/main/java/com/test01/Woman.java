package com.test01;

public class Woman {

    public void classWork() {
        System.out.println("출석 카드 찍기");

        try {
            System.out.println("컴퓨터를 키고 수업 웹서핑");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("집에 감");
        }
    }
}
