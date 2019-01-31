package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public class Intern extends Employee implements IPrintable {

    public Intern(String name, int age) {
        super(name, age);
    }

    @Override
    Double calcEarnings() {
        return null;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
}
