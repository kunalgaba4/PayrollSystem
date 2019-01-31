package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class Vehicle implements IPrintable {
    private String color;
    private String make;
    private int plate;
    private int wheels;

    public Vehicle(String color, String make, int plate, int wheels) {
        this.color = color;
        this.make = make;
        this.plate = plate;
        this.wheels = wheels;
    }

    abstract void drive(int miles);
    @Override
    public String printMyData() {
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
