package com.payroll.groupSeven;

import com.payroll.groupSeven.PartTime;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class FixedBasedPartTime extends PartTime {
    private double fixedAmount;
    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount, Vehicle vehicle) {
        super(name, age, rate, hoursWorked,vehicle);
        setFixedAmount(fixedAmount);
    }

    @Override
    Double calcEarnings() {
        return (getRate()*getHoursWorked())+getFixedAmount();
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
