package com.payroll.groupSeven;

import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class FixedBasedPartTime extends PartTime {
    private double fixedAmount;
    private Vehicle vehicle;

    FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount, Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        setFixedAmount(fixedAmount);
        setVehicle(vehicle);
    }

    @Override
    Double calcEarnings() {
        return (getRate() * getHoursWorked()) + getFixedAmount();
    }

    @Override
    public String printMyData() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fixed Amount:").append(getFixedAmount());
        return String.valueOf(stringBuilder);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Year of Birth: " + getAge() + "\n");
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append(" -Make: " + vehicle.getMake())
                .append("\n -Plate: " + vehicle.getPlate())
                .append("\n -Color: " + vehicle.getColor())
                .append("\n -Wheels: " + vehicle.getWheels());
        if (vehicle instanceof Car) {
            stringBuilder.append("\n -Miles: ")
                    .append(((Car) vehicle).getMiles());
        } else if (vehicle != null && vehicle instanceof Motorcycle) {
            stringBuilder.append("\n -No. of gears: ")
                    .append(((Motorcycle) vehicle).getNumberOfGears());
        }
        stringBuilder.append("\nEmployee is PartTime/ Fixed Amount")
                .append("\n -Rate: " + getRate())
                .append("\n -Hours Worked: " + getHoursWorked())
                .append("\n -Fixed amount: " + getFixedAmount())
                .append("\n -Earnings: " + calcEarnings())
                .append("(" + getHoursWorked() * getRate() + " + " + getFixedAmount() + ")");
        return String.valueOf(stringBuilder);
    }

    private void checkTypeOfVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n");
        } else {
            stringBuilder.append("Employee has a MotorCycle\n");
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
}
