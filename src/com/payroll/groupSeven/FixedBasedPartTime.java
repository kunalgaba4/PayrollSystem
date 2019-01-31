package com.payroll.groupSeven;

public class FixedBasedPartTime extends PartTime {

    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked) {
        super(name, age, rate, hoursWorked);
    }

    @Override
    Double calcEarnings() {
        return null;
    }
}
