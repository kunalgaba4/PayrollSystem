package com.payroll.groupSeven.vehicleInfo;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class Motorcycle extends Vehicle implements IPrintable {
    private  int numberOfGears;

    public Motorcycle(String color, String make, String plate, int wheels, int numberOfGears) {
        super(color, make, plate, wheels);
        setNumberOfGears(numberOfGears);
    }

    @Override
    void drive(int miles) {

    }

    @Override
    public String printMyData() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Number of gears").append(getNumberOfGears());
        return String.valueOf(stringBuilder);
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
