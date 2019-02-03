package com.payroll.groupSeven;

import com.payroll.groupSeven.Employee;

public class FullTime extends Employee {

    private double salary;
    private double bonus;

    public FullTime(String name, int age,double salary,double bonus) {
        super(name, age);
    }

    @Override
    Double calcEarnings() {
        return getSalary()+getBonus();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
