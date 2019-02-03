package com.payroll.groupSeven;

import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class PartTime extends Employee {
    private float rate;
    private float hoursWorked;

    public PartTime(String name, int age,float rate,float hoursWorked, Vehicle vehicle){
        super(name,age,vehicle);
        setRate(rate);
        setHoursWorked(hoursWorked);
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
