package com.payroll.groupSeven;

import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class PartTime extends Employee {
    private double rate;
    private float hoursWorked;
    private Vehicle vehicle;

    public PartTime(String name, int age,double rate,float hoursWorked, Vehicle vehicle){
        super(name,age,vehicle);
        setRate(rate);
        setHoursWorked(hoursWorked);
        this.vehicle=vehicle;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}
