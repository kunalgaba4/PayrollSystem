package com.payroll.groupSeven;

public class FixedBasedPartTime extends PartTime {
    private double fixedAmount;
    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount) {
        super(name, age, rate, hoursWorked);
        setFixedAmount(fixedAmount);
    }

    @Override
    Double calcEarnings() {
        return (getRate()*getHoursWorked())+fixedAmount;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
}
