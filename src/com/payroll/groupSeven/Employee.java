package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int calcBirthYear() {
        return age;
    }

    abstract Double calcEarnings();

    @Override
    public String printMyData() {
        return getName()+"--"+getAge();
    }

    @Override
    public String toString() {
        return getName()+"--"+getAge();

    }
}
