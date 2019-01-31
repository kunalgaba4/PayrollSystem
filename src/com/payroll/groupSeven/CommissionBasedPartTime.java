package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public class CommissionBasedPartTime extends PartTime implements IPrintable {
    private double commissionRate;

    public CommissionBasedPartTime(String name,int age, float rate, float hoursWorked, double commissionRate){
        super(name,age,rate,hoursWorked);
        setCommissionRate(commissionRate);
    }

    @Override
    Double calcEarnings() {
        return (getRate()*getHoursWorked())+commissionRate;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }

    public double commissionPercCalcEarnings(){
            return Double.parseDouble(null);
        }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate>0.0){
            this.commissionRate=commissionRate;
        }else {
            throw new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");
        }
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
