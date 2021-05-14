package com.test01;

public class Man {

    public void classWork() {
        System.out.println("출석 카드 찍기");

        try {
            System.out.println("컴퓨터를 키고 수업 준비");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("집에 감");
        }
    }
}
