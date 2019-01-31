package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public class Motorcycle extends Vehicle implements IPrintable {
    private  int numberOfGears;

    public Motorcycle(String color, String make, int plate, int wheels) {
        super(color, make, plate, wheels);
    }

    @Override
    void drive(int miles) {

    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
