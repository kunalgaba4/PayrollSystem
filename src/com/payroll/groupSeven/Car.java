package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public class Car extends Vehicle implements IPrintable {
    private  int numberOfSeats;

    public Car(String color, String make, int plate, int wheels) {
        super(color, make, plate, wheels);
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
