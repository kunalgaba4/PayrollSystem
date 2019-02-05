package com.payroll.groupSeven;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;
import com.payroll.groupSeven.vehicleInfo.Vehicle;

public class FullTime extends Employee {

    private double salary;
    private double bonus;
    private Vehicle vehicle;

    FullTime(String name, int age, double salary, double bonus, Vehicle vehicle) {
        super(name, age);
        setBonus(bonus);
        setSalary(salary);
        setVehicle(vehicle);
    }

    @Override
    public String printMyData() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Salary: ").append(getSalary())
                .append("Bonus:").append(getBonus());
        return String.valueOf(stringBuilder);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(getName()).append("\n")
                .append("Year of Birth: ");
        if (getAge() <= 0) {
            stringBuilder.append("Invalid Age").append("\n");
        } else {
            stringBuilder.append(getAge()).append("\n");
        }
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append("\nEmployee is Working FullTime")
                .append("\n -Salary: ")
                .append(getSalary())
                .append("\n -Bonus: ")
                .append(getBonus())
                .append("\n -Earnings ")
                .append(calcEarnings())
                .append(" (").append(getSalary()).append(" + ").append(getBonus()).append(")");
        return String.valueOf(stringBuilder);
    }

    private void checkTypeOfVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Wheels: ").append(getVehicle().getWheels())
                    .append("\n -Miles: ").append(((Car) getVehicle()).getMiles());
        } else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Employee has a MotorCycle\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Wheels: ").append(getVehicle().getWheels())
                    .append("\n -No. of gears: ").append(((Motorcycle) getVehicle()).getNumberOfGears());
        }
    }

    @Override
    Double calcEarnings() {
        return getSalary()+getBonus();
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary<0){
            this.salary=0;
        }else {
            this.salary = salary;
        }
    }

    private double getBonus() {
        return bonus;
    }

    private void setBonus(double bonus) {
        if (bonus<0){
            this.bonus=0;
        }else {
            this.bonus = bonus;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}
