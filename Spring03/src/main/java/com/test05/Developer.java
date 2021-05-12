package com.test05;

public class Developer {

    private Emp emp;
    private String dept;

    public Developer() {
    }

    public Developer(Emp emp, String dept) {
        this.emp = emp;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return emp + "\t 기술 (" + dept + ")";
    }
}
