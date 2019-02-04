package com.payroll.groupSeven;

import com.payroll.groupSeven.helperclasses.EmployeeSingelton;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;

public class PayrollSystem {
    public static double totalEarnings=0;
    public static void main(String []args){
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("",1995, 30,
                10,20,new Car("Black","Honda","Pb091015",4,2,15000));
        FixedBasedPartTime fixedBasedPartTime= new FixedBasedPartTime("Sumit",24,100,
                100,500,new Car("Black","Honda","Pb091015",4,2,10000));
        Intern intern= new Intern("karan",24,"Lambton",1000,null);
        FullTime fullTime= new FullTime("Kunal",24,1000,20,new Motorcycle("Black","Honda","Pb091015",2,5));

        EmployeeSingelton.getInstance().addToArray(commissionBasedPartTime);
        EmployeeSingelton.getInstance().addToArray(fixedBasedPartTime);
        EmployeeSingelton.getInstance().addToArray(intern);
        EmployeeSingelton.getInstance().addToArray(fullTime);

        for (Employee e: EmployeeSingelton.getInstance().getArray()) {
            System.out.println(e);
            System.out.println("-----------------------------------------------------------------------------------");
            totalEarnings=totalEarnings+e.calcEarnings();
        }
        EmployeeSingelton.getInstance().setTotalPayroll(totalEarnings);
        System.out.println("Total Payroll: "+totalEarnings);

//        PdfGenerator pdfGenerator= new PdfGenerator();
//        pdfGenerator.PdfGenrator();

    }


}
