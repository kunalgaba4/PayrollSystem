package com.payroll.groupSeven;

public class PayrollSystem {
    public static void main(String []args){
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Jagmeet",50,14,70,2.5);
        System.out.print(commissionBasedPartTime+" has earned CAD "+commissionBasedPartTime.calcEarnings());
    }


}
