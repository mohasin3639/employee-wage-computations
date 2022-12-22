package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrsFullTime = 8;
        int empHrsPartTime = 4;
        int dailyWage ;
        int empWagePerHrs = 20;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            dailyWage = empHrsFullTime * empWagePerHrs;
            System.out.println("the daily wage of employee is " + dailyWage);
        }
        else if (empCheck == IS_PART_TIME){
                System.out.println("Employee is Part-Time Present");
                dailyWage = empHrsPartTime * empWagePerHrs;
                System.out.println("the daily wage of employee is "+dailyWage);
            } else {
            System.out.println("Employee is Absent");
        }
    }
}