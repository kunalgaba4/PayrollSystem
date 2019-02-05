package com.payroll.groupSeven;

import com.payroll.groupSeven.helper.EmployeeSingelton;
import com.payroll.groupSeven.helper.PdfGenerator;
import com.payroll.groupSeven.vehicleInfo.Car;
import com.payroll.groupSeven.vehicleInfo.Motorcycle;

public class PayrollSystem {
    public static double totalEarnings=0;
    public static void main(String []args){
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Jagmeet",0, 10,
                10,20,new Car("Black","Honda","Pb091015",4,2,15000));
        CommissionBasedPartTime commissionBasedPartTime2= new CommissionBasedPartTime("Priya",35, 20,
                10,12.5,new Car("Blue","Skoda","Pb091029",4,2,25000));

        FixedBasedPartTime fixedBasedPartTime= new FixedBasedPartTime("Sumit",24,100,
                100,500,new Car("Black","Honda","Pb091015",4,2,10000));
        FixedBasedPartTime fixedBasedPartTime2= new FixedBasedPartTime("Sam",20,100,
                100,500,new Car("Black","Honda","Pb091015",4,2,10000));
        FixedBasedPartTime fixedBasedPartTime3= new FixedBasedPartTime("Sam",20,100,
                100,500,new Car("Black","Honda","Pb091015",4,2,10000));


        Intern intern= new Intern("karan",24,"Lambton",1000,null);
        Intern intern2= new Intern("Jenny",42,"York",10000,new Car("Red","Ford","Pb091015",4,5,1500));

        FullTime fullTime= new FullTime("Kunal",24,1000,20,new Motorcycle("Black","Honda","Pb091015",2,5));
        FullTime fullTime2= new FullTime("Preet",24,19000,200,new Motorcycle("Grey","Platina","MH08766",2,5));

        EmployeeSingelton.getInstance().addToArray(commissionBasedPartTime);
        EmployeeSingelton.getInstance().addToArray(commissionBasedPartTime2);
        EmployeeSingelton.getInstance().addToArray(fixedBasedPartTime2);
        EmployeeSingelton.getInstance().addToArray(fixedBasedPartTime3);
        EmployeeSingelton.getInstance().addToArray(fixedBasedPartTime);
        EmployeeSingelton.getInstance().addToArray(intern);
        EmployeeSingelton.getInstance().addToArray(intern2);
        EmployeeSingelton.getInstance().addToArray(fullTime);
        EmployeeSingelton.getInstance().addToArray(fullTime2);

        for (Employee e: EmployeeSingelton.getInstance().getArray()) {
            System.out.println(e);
            System.out.println("-----------------------------------------------------------------------------------");
            totalEarnings=totalEarnings+e.calcEarnings();
        }
        EmployeeSingelton.getInstance().setTotalPayroll(totalEarnings);
        System.out.println("Total Payroll: "+totalEarnings);

        PdfGenerator pdfGenerator= new PdfGenerator();
        pdfGenerator.PdfGenrator();

    }


}
