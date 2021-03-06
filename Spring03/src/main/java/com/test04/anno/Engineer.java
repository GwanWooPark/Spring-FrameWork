package com.test04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("honggd")
public class Engineer {

    @Autowired
    @Qualifier("hong")
    private Emp emp;

    @Value("도커")
    private String dept;

    public Engineer() {

    }

    public Engineer(Emp emp, String dept) {
        this.emp = emp;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return emp + "\t 기술 (" + dept + ")";
    }
}
