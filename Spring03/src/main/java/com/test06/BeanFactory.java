package com.test06;

public class BeanFactory {

    Object getBean(String name) {

        if (name.equals("samsung")) {
            return new SamsungTV();
        } else if (name.equals("lg")) {
            return new LGTV();
        }

        return null;
    }
}
