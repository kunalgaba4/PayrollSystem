package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class Employee implements IPrintable {
    private String name;
    private int year;
    private Vehicle vehicle;

    public Employee(String name, int year, Vehicle vehicle) {
        setName(name);
        setYear(year);
        setVehicle(vehicle);
    }

    public Employee(String name, int year) {
        setName(name);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
