package com.payroll.groupSeven;

import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class PartTime extends Employee {
    private float rate;
    private float hoursWorked;
    private Vehicle vehicle;

    public PartTime(String name, int age, float rate, float hoursWorked, Vehicle vehicle) {
        super(name, age, vehicle);
        setRate(rate);
        setHoursWorked(hoursWorked);
        this.vehicle=vehicle;
    }

    @Override
    public String printMyData() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rate:").append(getRate())
                .append("\n Hours Worked").append(getHoursWorked());
        return String.valueOf(stringBuilder);
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
<<<<<<< HEAD
        this.rate = rate;
=======
        if (rate > 0.0) {
            this.rate = rate;
        } else {
            throw new IllegalArgumentException("Rate must be greater then 0");
        }

>>>>>>> da99afb277b8f8d59e10412815d558be22bc61f3
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        if(hoursWorked<0){
            throw new IllegalArgumentException("Hours must be greater than zero");
        }
        this.hoursWorked = hoursWorked;
    }


}
