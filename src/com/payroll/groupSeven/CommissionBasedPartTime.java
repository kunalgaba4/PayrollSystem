package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public class CommissionBasedPartTime extends PartTime implements IPrintable {
    private double commissionPerc;

    public CommissionBasedPartTime(String name,int age, float rate, float hoursWorked, double commissionPerc){
        super(name,age,rate,hoursWorked);
        setcommissionPerc(commissionPerc);
    }

    @Override
    Double calcEarnings() {
        return (getRate()*getHoursWorked())+commissionPerc;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }


    public double getcommissionPerc() {
        return commissionPerc;
    }

    public void setcommissionPerc(double commissionPerc) {
        if (commissionPerc>0.0){
            this.commissionPerc=commissionPerc;
        }else {
            throw new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");
        }
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
