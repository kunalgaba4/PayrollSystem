package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

import java.util.Calendar;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private Vehicle vehicle;

    public Employee(String name, int age, Vehicle vehicle) {
        setName(name);
        setAge(age);
        setVehicle(vehicle);
    }

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.equalsIgnoreCase("")){
            this.name="No Name";
        }else {
            this.name = name;
        }
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {

            int current_year = Calendar.getInstance().get(Calendar.YEAR) - age;
            this.age=current_year;
        }
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
        return "Name: "+getName()+"\n"+"Year of Birth: "+ getAge();
    }
}
