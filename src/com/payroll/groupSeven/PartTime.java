package com.payroll.groupSeven;

import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class PartTime extends Employee {
    private float rate;
    private float hoursWorked;
    private Vehicle vehicle;

    public PartTime(String name, int age,float rate,float hoursWorked, Vehicle vehicle){
        super(name,age,vehicle);
        setRate(rate);
        setHoursWorked(hoursWorked);
        setVehicle(vehicle);
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (rate>0.0){
            this.rate = rate;
        }else {
            throw new IllegalArgumentException("Rate must be greater then 0");
        }

    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}
