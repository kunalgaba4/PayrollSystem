package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private Vehicle vehicle;

    public Employee(String name, int age, Vehicle vehicle) {
        this.name=name;
        this.age=age;
        if (vehicle instanceof Car){
            this.vehicle= vehicle;
        }else if (vehicle instanceof Motorcycle){

        }
    }

    public Employee(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int calcBirthYear() {
        return age;
    }

    abstract Double calcEarnings();

    @Override
    public String printMyData() {
        return "Name: "+getName()+"\n"+"Year of Birth"+getAge();
    }
}
