package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class Vehicle implements IPrintable {
    private String color;
    private String model;
    private int maxSpeed;
    private int wheels;
    private Employee employee;

    @Override
    public String printMyData() {
        return null;
    }
}
