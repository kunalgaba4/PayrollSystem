package com.payroll.groupSeven.vehicleInfo;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class Vehicle implements IPrintable {
    private String color;
    private String make;
    private String plate;
    private int wheels;

    public Vehicle(String color, String make, String plate, int wheels) {
        setColor(color);
        setMake(make);
        setPlate(plate);
        setWheels(wheels);
    }

    abstract void drive(int miles);
    @Override
    public String printMyData() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Color:").append(getColor()).append("\n");
        stringBuilder.append("make:").append(getMake()).append("\n");
        stringBuilder.append("plate:").append(getPlate()).append("\n");
        stringBuilder.append("wheels:").append(getWheels()).append("\n");
        return String.valueOf(stringBuilder);
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
