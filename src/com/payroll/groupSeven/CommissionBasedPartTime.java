package com.payroll.groupSeven;

import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class CommissionBasedPartTime extends PartTime {
    private double commissionPerc;
    private Vehicle vehicle;

    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc, Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        setcommissionPerc(commissionPerc);
        this.vehicle = vehicle;
    }

    @Override
    Double calcEarnings() {
        return (getRate() * getHoursWorked()) + getcommissionPerc();
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }


    public double getcommissionPerc() {

        return commissionPerc;
    }

    public void setcommissionPerc(double commissionPerc) {
        if (commissionPerc > 0.0) {
            this.commissionPerc = commissionPerc;
        } else {
            throw new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Year of Birth: " + getYear() + "\n");
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append("\nEmployee is PartTime/ Comissioned")
                .append("\n Rate: " + getRate())
                .append("\n Hours Worked: " + getHoursWorked())
                .append("\n Comission: " + commissionPerc)
                .append("\n Earnings: " + calcEarnings())
                .append("(" + getHoursWorked() * getRate() + " + " + getcommissionPerc() + "% of " + getHoursWorked() * getRate() + ")")
                .append("\n-------------------------------------------------------------------------------------");
        return String.valueOf(stringBuilder);

    }

    private void checkTypeOfVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n")
                    .append(" -Make: " + vehicle.getMake())
                    .append("\n -Plate: " + vehicle.getPlate())
                    .append("\n -Color: " + vehicle.getColor())
                    .append("\n -Wheels: " + vehicle.getWheels())
                    .append("\n -Miles: " + ((Car) vehicle).getMiles());
        } else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Employee has a MotorCycle\n")
                    .append(" -Make: " + vehicle.getMake())
                    .append("\n -Plate: " + vehicle.getPlate())
                    .append("\n -Color: " + vehicle.getColor())
                    .append("\n -Wheels: " + vehicle.getWheels())
                    .append("\n -No. of gears: " + ((Motorcycle) vehicle).getNumberOfGears());
        }
    }
}
