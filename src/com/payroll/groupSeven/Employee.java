package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private int year;
    private Vehicle vehicle;

    public Employee(String name, int year, Vehicle vehicle) {
        this.name=name;
        this.year =year;
        this.vehicle=vehicle;
    }

    public Employee(String name, int year) {
        this.name=name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return (2018-year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int calcBirthYear() {
        return year;
    }

    abstract Double calcEarnings();

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public String printMyData() {
        return "Name: "+getName()+"\n"+"Year of Birth: "+ getYear();
    }
}
