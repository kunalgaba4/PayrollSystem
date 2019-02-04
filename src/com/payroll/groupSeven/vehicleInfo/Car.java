package com.payroll.groupSeven.vehicleInfo;

import com.payroll.groupSeven.Interfaces.IPrintable;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class Car extends Vehicle implements IPrintable {
    private  int numberOfSeats;
    private  double miles;

    public Car(String color, String make, String plate, int wheels, int numberOfSeats, double miles) {
        super(color, make, plate, wheels);
        setNumberOfSeats(numberOfSeats);
        setMiles(miles);
    }

    @Override
    void drive(int miles) {
        this.miles=miles;
    }

    public double getMiles() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
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
