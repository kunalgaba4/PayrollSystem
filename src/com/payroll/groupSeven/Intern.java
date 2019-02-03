package com.payroll.groupSeven;

import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.Interfaces.IPrintable;

public class Intern extends Employee implements IPrintable {
    private String schoolName;
    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName=schoolName;
    }

    @Override
    Double calcEarnings() {
        return null;
    }

    @Override
    public String printMyData() {
        return getName()+getAge()+schoolName;
    }
}
