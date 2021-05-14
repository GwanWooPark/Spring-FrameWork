package com.test06;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Woman implements Person{

    @Override
    public void classWork() {
        System.out.println("컴퓨터 켜서 웹서핑");
    }
}
