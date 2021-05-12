package com.test03;

public class developer extends Emp {

    private String dept;

    public developer() {
    }

    public developer(String name, int salary) {
        super(name, salary);
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return super.toString() + "\t 부서 : 개발(" + dept + ")";
    }
}
