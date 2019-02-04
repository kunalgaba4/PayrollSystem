package com.payroll.groupSeven;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class FullTime extends Employee {

    private double salary;
    private double bonus;
    private Vehicle vehicle;

    public FullTime(String name, int age,double salary,double bonus, Vehicle vehicle) {
        super(name, age);
        setBonus(bonus);
        setSalary(salary);
    }

    @Override
    Double calcEarnings() {
        return getSalary()+getBonus();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Year of Birth: " + getYear() + "\n");
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append("\nEmployee is Working FullTime")
                .append("\n -Salary: " + getSalary())
                .append("\n -Bonus: " + getBonus())
                .append("\n -Earnings " + calcEarnings())
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
