package com.payroll.groupSeven;

import java.util.ArrayList;

public class EmployeeSingelton {
    private static EmployeeSingelton ourInstance;
    private ArrayList<Employee> employeeArrayList= null;
    private double totalPayroll;

    public static EmployeeSingelton getInstance() {
        if (ourInstance==null)
            ourInstance = new EmployeeSingelton();

        return ourInstance;
    }

    private EmployeeSingelton() {
        employeeArrayList= new ArrayList<>();
    }

    public ArrayList<Employee> getArray() {
        return this.employeeArrayList;
    }
    //Add element to array
    public void addToArray(Employee employee) {
        employeeArrayList.add(employee);
    }

    public double getTotalPayroll() {
        return totalPayroll;
    }

    public void setTotalPayroll(double totalPayroll) {
        this.totalPayroll = totalPayroll;
    }
}
