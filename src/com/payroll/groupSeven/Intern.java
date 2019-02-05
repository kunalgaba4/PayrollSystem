package com.payroll.groupSeven;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class Intern extends Employee {
    private String schoolName;
    private Vehicle vehicle;
    private double earnings;

    public Intern(String name, int year, String schoolName,double earnings, Vehicle vehicle) {
        super(name, year);
        setSchoolName(schoolName);
        setVehicle(vehicle);
        setEarnings(earnings);
    }

    @Override
    Double calcEarnings() {
        return earnings;
    }

    @Override
    public String printMyData() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("School Name:").append(getSchoolName())
                .append("\n Earnings:").append(getEarnings());
        return String.valueOf(stringBuilder);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Year of Birth: " + getAge() + "\n");
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append("\nEmployee is Intern")
                .append("\n -School name: "+getSchoolName())
                .append("\n -Earnings: "+calcEarnings());
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

}
