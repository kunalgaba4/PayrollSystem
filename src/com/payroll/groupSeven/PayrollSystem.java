package com.payroll.groupSeven;

import com.payroll.groupSeven.CommissionBasedPartTime;
import com.payroll.groupSeven.Employee;
import com.payroll.groupSeven.FixedBasedPartTime;
import com.payroll.groupSeven.Intern;
import com.payroll.groupSeven.vehicleInfo.Car;

import java.util.ArrayList;

public class PayrollSystem {
    public static void main(String []args){
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Jagmeet",50, 14,
                70,2.5,new Car("Black","Honda","Pb091015",4,2));

//        System.out.print(commissionBasedPartTime);

        FixedBasedPartTime fixedBasedPartTime= new FixedBasedPartTime("Sumit",24,100,
                100,500,new Car("Black","Honda","Pb091015",4,2));
        Intern intern= new Intern("Kunal",24,"Lambton");

        ArrayList<Employee> employeeArrayList= new ArrayList<>();
        employeeArrayList.add(commissionBasedPartTime);
        employeeArrayList.add(fixedBasedPartTime);
        employeeArrayList.add(intern);

        for (Employee e: employeeArrayList) {
            System.out.println(e);

        }



    }


}
