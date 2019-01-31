package com.payroll.groupSeven;

import com.payroll.groupSeven.Interfaces.IPrintable;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private Car car;

    public Employee(String name, int age) {
        this.name=name;
        this.age=age;
        if (true){
            car= new Car("Black","Honda",1234,4,4);
            car.drive(10);
        }
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

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Name: "+getName()+"\n"+"Year of Birth: "+getAge()+"\n");
        if (true){
            stringBuilder.append("Employee has a Car\n");
            stringBuilder.append(" -Make: "+ car.getMake());
            stringBuilder.append("\n -Plate: "+ car.getPlate());
            stringBuilder.append("\n -Color: "+ car.getColor());
            stringBuilder.append("\n -Wheels: "+ car.getWheels());
            stringBuilder.append("\n -Miles: "+ car.getMiles());
        }
        return String.valueOf(stringBuilder);

    }
}
