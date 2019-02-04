package com.payroll.groupSeven;

import com.payroll.groupSeven.CommissionBasedPartTime;
import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.FixedBasedPartTime;
import com.payroll.groupSeven.Intern;
import com.payroll.groupSeven.vehicleInfo.Car;

import java.util.ArrayList;

public class PayrollSystem {
    public static double totalEarnings=0;
    public static void main(String []args){
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Jagmeet",50, 30,
                10,20,new Car("Black","Honda","Pb091015",4,2,15000));
        FixedBasedPartTime fixedBasedPartTime= new FixedBasedPartTime("Sumit",24,100,
                100,500,new Car("Black","Honda","Pb091015",4,2,10000));
        Intern intern= new Intern("karan",24,"Lambton",1000,null);
        FullTime fullTime= new FullTime("Kunal",24,1000,20,null);

        ArrayList<Employee> employeeArrayList= new ArrayList<>();
        employeeArrayList.add(commissionBasedPartTime);
        employeeArrayList.add(fixedBasedPartTime);
        employeeArrayList.add(intern);
        employeeArrayList.add(fullTime);

        for (Employee e: employeeArrayList) {
            System.out.println(e);
            totalEarnings=totalEarnings+e.calcEarnings();
        }
        System.out.println("Total Payroll: "+totalEarnings);



    }


}
