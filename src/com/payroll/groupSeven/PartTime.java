package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class PartTime extends Employee implements IPrintable {
    private float rate;
    private float hoursWorked;

    public PartTime(String name, int age,float rate,float hoursWorked){
        super(name,age);
        this.rate=rate;
        this.hoursWorked=hoursWorked;
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

    @Override
    public String toString() {
        return getName()+" with age "+getAge()+" has worked for "+getHoursWorked();
    }
}
